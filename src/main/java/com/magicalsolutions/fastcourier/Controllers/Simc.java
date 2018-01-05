package com.magicalsolutions.fastcourier.Controllers;

import org.springframework.web.bind.annotation.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@CrossOrigin( origins = "*" )
public class Simc {
    Set<String> miejscowosci = new HashSet<>();

    public Simc() throws IOException, SAXException, ParserConfigurationException {
        InputStream simc = Simc.class.getResourceAsStream("/dane_polski/SIMC_Urzedowy_2017-12-12.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(simc);

        doc.getDocumentElement().normalize();

        NodeList nList = doc.getElementsByTagName("row");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;

                this.miejscowosci.add(eElement.getElementsByTagName("NAZWA").item(0).getTextContent());
            }
        }
    }

    @RequestMapping("/simc.json")
    public @ResponseBody Set<String> simc(@RequestParam("s") String keyword) {
        return this.miejscowosci.parallelStream().filter(s -> s.toLowerCase().contains(keyword.toLowerCase())).collect(Collectors.toSet());
    }
}
