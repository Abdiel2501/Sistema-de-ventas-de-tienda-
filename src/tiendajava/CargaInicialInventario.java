package tiendajava;

public class CargaInicialInventario {

    public static void cargarProductos(Inventario inventario) {
        inventario.silencioso = true;
        almacenista pancho = new almacenista();

        pancho.registrarProducto(inventario, "646441025184", "Arroz 1kg", "Granos y semillas",
                "Distribuidora La Cosecha S.A. de C.V.", 22.00, 24);
        pancho.registrarProducto(inventario, "7501578540019", "Frijol 1kg", "Granos y semillas",
                "Distribuidora La Cosecha S.A. de C.V.", 26.00, 13);
        pancho.registrarProducto(inventario, "7501578550018", "Avena 1kg", "Granos y semillas",
                "Distribuidora La Cosecha S.A. de C.V.", 15.00, 45);
        pancho.registrarProducto(inventario, "8480000340955", "Semillas de Calabaza 125g", "Granos y semillas",
                "Distribuidora La Cosecha S.A. de C.V.", 18.00, 41);
        pancho.registrarProducto(inventario, "472201448", "Semillas de Girasol 100g", "Granos y semillas",
                "Distribuidora La Cosecha S.A. de C.V.", 21.00, 38);
        pancho.registrarProducto(inventario, "7501578550032", "Lentejas 500g", "Granos y semillas",
                "Distribuidora La Cosecha S.A. de C.V.", 29.00, 27);
        pancho.registrarProducto(inventario, "8711299021004", "Chía 150g", "Granos y semillas",
                "Distribuidora La Cosecha S.A. de C.V.", 74.00, 23);
        pancho.registrarProducto(inventario, "7501008018125", "Cereal (Chocokrispis) 290g", "Granos y semillas",
                "Distribuidora La Cosecha S.A. de C.V.", 55.00, 79);
        pancho.registrarProducto(inventario, "7501578550049", "Maíz Palomero 500g", "Granos y semillas",
                "Distribuidora La Cosecha S.A. de C.V.", 18.00, 21);
        pancho.registrarProducto(inventario, "7501045404295", "Atún Mazatún en hojuelas en agua 285 g", "Enlatados",
                "Grupo La Costeña / Conservas del Centro", 45.00, 64);
        pancho.registrarProducto(inventario, "7501045404301", "Atún Mazatún en hojuelas en agua con aceite 285 g",
                "Enlatados", "Grupo La Costeña / Conservas del Centro", 45.00, 14);
        pancho.registrarProducto(inventario, "7501017051298", "Ensalada La Costeña campesina 220 g", "Enlatados",
                "Grupo La Costeña / Conservas del Centro", 9.50, 13);
        pancho.registrarProducto(inventario, "7501017005314", "Chícharos La costeña 220 g", "Enlatados",
                "Grupo La Costeña / Conservas del Centro", 10.00, 21);
        pancho.registrarProducto(inventario, "7501017004881", "Huitlacoche La costeña 380 g", "Enlatados",
                "Grupo La Costeña / Conservas del Centro", 72.00, 37);
        pancho.registrarProducto(inventario, "7501017043590", "Garbanzos La costeña 420 g", "Enlatados",
                "Grupo La Costeña / Conservas del Centro", 26.00, 39);
        pancho.registrarProducto(inventario, "7501017004911", "Chiles chipotles La costeña adobados 380 g", "Enlatados",
                "Grupo La Costeña / Conservas del Centro", 58.00, 74);
        pancho.registrarProducto(inventario, "7501017040681", "Chiles jalapeños La costeña picados en escabeche 380 g",
                "Enlatados", "Grupo La Costeña / Conservas del Centro", 36.00, 13);
        pancho.registrarProducto(inventario, "7501011320178", "Crema de Elote Campbell’s 310g", "Enlatados",
                "Grupo La Costeña / Conservas del Centro", 39.00, 35);
        pancho.registrarProducto(inventario, "7501011315976", "Sopa de Tomate Campbell’s 310g", "Enlatados",
                "Grupo La Costeña / Conservas del Centro", 40.00, 79);
        pancho.registrarProducto(inventario, "7501052420011", "Frijoles Refritos Claros La Sierra 440g", "Enlatados",
                "Grupo La Costeña / Conservas del Centro", 19.00, 63);
        pancho.registrarProducto(inventario, "7501052425061", "Frijoles Enteros Ranch 415g", "Enlatados",
                "Grupo La Costeña / Conservas del Centro", 17.00, 38);
        pancho.registrarProducto(inventario, "46900001778", "Frijoles Ranch Style 425g", "Enlatados",
                "Grupo La Costeña / Conservas del Centro", 24.00, 67);
        pancho.registrarProducto(inventario, "7501017040001", "Frijoles Puercos La Costeña 440g", "Enlatados",
                "Grupo La Costeña / Conservas del Centro", 21.00, 45);
        pancho.registrarProducto(inventario, "44774030108", "Maiz Pozolero Alfresco 425g", "Enlatados",
                "Grupo La Costeña / Conservas del Centro", 66.00, 10);
        pancho.registrarProducto(inventario, "7501017042081", "Salsa verde para Enchiladas 420g", "Enlatados",
                "Grupo La Costeña / Conservas del Centro", 28.00, 30);
        pancho.registrarProducto(inventario, "7501017005024", "Rajas de jalapeño La Costeña en escabeche 220 g:",
                "Enlatados", "Grupo La Costeña / Conservas del Centro", 20.00, 64);
        pancho.registrarProducto(inventario, "7501017003648", "Pozole rojo La Costeña de 810 g", "Enlatados",
                "Grupo La Costeña / Conservas del Centro", 142.00, 53);
        pancho.registrarProducto(inventario, "7501017006021", "Chiles chipotles La Costeña en adobo 105 g", "Enlatados",
                "Grupo La Costeña / Conservas del Centro", 14.00, 45);
        pancho.registrarProducto(inventario, "605388344427", "Ensalada de legumbres Great Value – 215 g", "Enlatados",
                "Grupo La Costeña / Conservas del Centro", 10.00, 29);
        pancho.registrarProducto(inventario, "7501041415646", "Ensalada de salmón Tuny con mayonesa 135 g", "Enlatados",
                "Grupo La Costeña / Conservas del Centro", 26.00, 37);
        pancho.registrarProducto(inventario, "7501006532814", "Ensalada campesina – Del Monte – 215g", "Enlatados",
                "Grupo La Costeña / Conservas del Centro", 12.00, 53);
        pancho.registrarProducto(inventario, "750101700583", "La Costeña Zanahorias en escabeche – 230 g", "Enlatados",
                "Grupo La Costeña / Conservas del Centro", 15.00, 23);
        pancho.registrarProducto(inventario, "7501055354672", "Coca-Cola Original 235 ml (Vidrio)", "Refrescos",
                "Coca-Cola FEMSA", 9.00, 21);
        pancho.registrarProducto(inventario, "750105536154", "Coca-Cola Original 355 ml (Vidrio)", "Refrescos",
                "Coca-Cola FEMSA", 13.00, 58);
        pancho.registrarProducto(inventario, "7501055302086", "Coca-Cola Original 500 ml (Vidrio)", "Refrescos",
                "Coca-Cola FEMSA", 15.00, 22);
        pancho.registrarProducto(inventario, "7501055335305", "Coca-Cola Original 1.25 Litros (Vidrio)", "Refrescos",
                "Coca-Cola FEMSA", 24.00, 55);
        pancho.registrarProducto(inventario, "7501055328154", "Escuis de Hierro 600 ml", "Refrescos", "Coca-Cola FEMSA",
                19.00, 54);
        pancho.registrarProducto(inventario, "7501071101129", "Escuis de Manzana 600 ml", "Refrescos",
                "Coca-Cola FEMSA", 19.00, 43);
        pancho.registrarProducto(inventario, "7501071101136", "Escuis de Fresa 600 ml", "Refrescos", "Coca-Cola FEMSA",
                19.00, 15);
        pancho.registrarProducto(inventario, "7501011130981", "Squirt 355 ml (Vidrio)", "Refrescos", "Coca-Cola FEMSA",
                13.00, 68);
        pancho.registrarProducto(inventario, "7501040416032", "Jarritos Mandarina 355 ml (Vidrio)", "Refrescos",
                "Coca-Cola FEMSA", 12.00, 78);
        pancho.registrarProducto(inventario, "75010553", "Coca-Cola Original 355 ml (Lata)", "Refrescos",
                "Coca-Cola FEMSA", 18.00, 25);
        pancho.registrarProducto(inventario, "7501055361557", "Coca-Cola Zero 355 ml (Lata)", "Refrescos",
                "Coca-Cola FEMSA", 18.00, 58);
        pancho.registrarProducto(inventario, "7501055365395", "Coca-Cola Light 355 ml (Lata)", "Refrescos",
                "Coca-Cola FEMSA", 18.00, 20);
        pancho.registrarProducto(inventario, "7501055305185", "Sprite 355 ml (Lata)", "Refrescos", "Coca-Cola FEMSA",
                16.00, 80);
        pancho.registrarProducto(inventario, "7501055305161", "Fanta Naranja 355 ml (Lata)", "Refrescos",
                "Coca-Cola FEMSA", 16.00, 47);
        pancho.registrarProducto(inventario, "7501011145220", "Dr Pepper 355 ml (Lata)", "Refrescos", "Coca-Cola FEMSA",
                18.00, 56);
        pancho.registrarProducto(inventario, "7501022013021", "Pepsi Black 355 ml (Lata)", "Refrescos",
                "Coca-Cola FEMSA", 15.00, 34);
        pancho.registrarProducto(inventario, "7501011305280", "7 Up 355 ml (Lata)", "Refrescos", "Coca-Cola FEMSA",
                15.00, 18);
        pancho.registrarProducto(inventario, "7501055320140", "Coca-Cola Original 250 ml (Plástico)", "Refrescos",
                "Coca-Cola FEMSA", 10.00, 15);
        pancho.registrarProducto(inventario, "7501055355418", "Coca-Cola Original 400 ml (Plástico)", "Refrescos",
                "Coca-Cola FEMSA", 13.00, 39);
        pancho.registrarProducto(inventario, "75007614", "Coca-Cola Original 600 ml (Plástico)", "Refrescos",
                "Coca-Cola FEMSA", 19.00, 47);
        pancho.registrarProducto(inventario, "7501055320639", "Coca-Cola Zero 600 ml (Plástico)", "Refrescos",
                "Coca-Cola FEMSA", 19.00, 20);
        pancho.registrarProducto(inventario, "7501055305339", "Coca-Cola Light 600 ml (Plástico)", "Refrescos",
                "Coca-Cola FEMSA", 19.00, 39);
        pancho.registrarProducto(inventario, "7501055302788", "Sprite 600 ml (Plástico)", "Refrescos",
                "Coca-Cola FEMSA", 17.00, 22);
        pancho.registrarProducto(inventario, "7501055302764", "Fresca 600 ml (Plástico)", "Refrescos",
                "Coca-Cola FEMSA", 17.00, 58);
        pancho.registrarProducto(inventario, "7501055312381", "Sidral Mundet 600 ml (Plástico)", "Refrescos",
                "Coca-Cola FEMSA", 17.00, 45);
        pancho.registrarProducto(inventario, "7501011301015", "Manzanita Sol 600 ml (Plástico)", "Refrescos",
                "Coca-Cola FEMSA", 16.00, 68);
        pancho.registrarProducto(inventario, "7501031310012", "Pepsi 600 ml (Plástico)", "Refrescos", "Coca-Cola FEMSA",
                16.00, 56);
        pancho.registrarProducto(inventario, "7501011115599", "Squirt 600 ml (Plástico)", "Refrescos",
                "Coca-Cola FEMSA", 17.00, 30);
        pancho.registrarProducto(inventario, "7501011122177", "Peñafiel Limón 600 ml (Plástico)", "Refrescos",
                "Coca-Cola FEMSA", 16.00, 57);
        pancho.registrarProducto(inventario, "7501055303358", "Coca-Cola Original 1.5 Litros (Plástico)", "Refrescos",
                "Coca-Cola FEMSA", 26.00, 55);
        pancho.registrarProducto(inventario, "7501055305247", "Coca-Cola Original 2.5 Litros (Plástico)", "Refrescos",
                "Coca-Cola FEMSA", 34.00, 36);
        pancho.registrarProducto(inventario, "7501055304745", "Coca-Cola Original 3 Litros (Plástico)", "Refrescos",
                "Coca-Cola FEMSA", 45.00, 44);
        pancho.registrarProducto(inventario, "7501055336158", "Coca-Cola Zero 3 Litros (Plástico)", "Refrescos",
                "Coca-Cola FEMSA", 40.00, 19);
        pancho.registrarProducto(inventario, "7501055318369", "Sprite 2.5 Litros (Plástico)", "Refrescos",
                "Coca-Cola FEMSA", 30.00, 31);
        pancho.registrarProducto(inventario, "7501055320553", "Fresca 3 Litros (Plástico)", "Refrescos",
                "Coca-Cola FEMSA", 36.00, 78);
        pancho.registrarProducto(inventario, "7501043321819", "Cerveza Corona Extra 355ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 22.00, 41);
        pancho.registrarProducto(inventario, "7506001338908", "Cerveza Victoria 355ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 21.00, 30);
        pancho.registrarProducto(inventario, "7503863794026", "Cerveza Modelo Especial 355ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 24.50, 69);
        pancho.registrarProducto(inventario, "7505423511615", "Cerveza Tecate Light 355ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 20.00, 58);
        pancho.registrarProducto(inventario, "7505940781618", "Cerveza Dos Equis XX Ambar 355ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 23.00, 44);
        pancho.registrarProducto(inventario, "7504959310341", "Cerveza Heineken Original 355ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 28.00, 38);
        pancho.registrarProducto(inventario, "7503164752553", "Cerveza Indio 355ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 21.50, 51);
        pancho.registrarProducto(inventario, "7504192832764", "Cerveza Stella Artois 330ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 32.00, 17);
        pancho.registrarProducto(inventario, "7508350305641", "Cerveza Michelob Ultra 355ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 26.00, 39);
        pancho.registrarProducto(inventario, "7503953767242", "Cerveza Pacifico Clara 355ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 22.00, 14);
        pancho.registrarProducto(inventario, "7503884969653", "Tequila Don Julio Reposado 700ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 849.00, 50);
        pancho.registrarProducto(inventario, "7502871012269", "Tequila José Cuervo Especial Reposado 990ml",
                "Bebidas Alcohólicas", "Distribuidora de Vinos y Licores del Valle", 310.00, 61);
        pancho.registrarProducto(inventario, "7501669784801", "Tequila Maestro Dobel Diamante 700ml",
                "Bebidas Alcohólicas", "Distribuidora de Vinos y Licores del Valle", 780.00, 44);
        pancho.registrarProducto(inventario, "7508451462704", "Tequila Centenario Plata 700ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 290.00, 18);
        pancho.registrarProducto(inventario, "7508281489325", "Tequila Herradura Reposado 700ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 620.00, 37);
        pancho.registrarProducto(inventario, "7502880957015", "Tequila Casamigos Blanco 750ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 950.00, 50);
        pancho.registrarProducto(inventario, "7504303911718", "Mezcal 400 Conejos Espadín Joven 750ml",
                "Bebidas Alcohólicas", "Distribuidora de Vinos y Licores del Valle", 470.00, 37);
        pancho.registrarProducto(inventario, "7502278248963", "Mezcal Ojo de Tigre Reposado 700ml",
                "Bebidas Alcohólicas", "Distribuidora de Vinos y Licores del Valle", 590.00, 73);
        pancho.registrarProducto(inventario, "7508346578713", "Whisky Johnnie Walker Red Label 700ml",
                "Bebidas Alcohólicas", "Distribuidora de Vinos y Licores del Valle", 340.00, 60);
        pancho.registrarProducto(inventario, "7503150983930", "Whisky Johnnie Walker Black Label 750ml",
                "Bebidas Alcohólicas", "Distribuidora de Vinos y Licores del Valle", 890.00, 68);
        pancho.registrarProducto(inventario, "7501031051834", "Whisky Jack Daniel's Old No. 7 700ml",
                "Bebidas Alcohólicas", "Distribuidora de Vinos y Licores del Valle", 450.00, 28);
        pancho.registrarProducto(inventario, "7507382997376", "Whisky Chivas Regal 12 Años 750ml",
                "Bebidas Alcohólicas", "Distribuidora de Vinos y Licores del Valle", 750.00, 43);
        pancho.registrarProducto(inventario, "7503116566701", "Whisky Buchanan's Deluxe 12 Años 750ml",
                "Bebidas Alcohólicas", "Distribuidora de Vinos y Licores del Valle", 870.00, 27);
        pancho.registrarProducto(inventario, "7500651333872", "Vodka Absolut Blue 750ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 295.00, 41);
        pancho.registrarProducto(inventario, "7506247317810", "Vodka Smirnoff No. 21 750ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 210.00, 78);
        pancho.registrarProducto(inventario, "7508013267736", "Vodka Grey Goose Original 750ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 920.00, 43);
        pancho.registrarProducto(inventario, "7500260647468", "Ron Bacardí Carta Blanca 980ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 250.00, 64);
        pancho.registrarProducto(inventario, "7507234309805", "Ron Captain Morgan Original Spiced 700ml",
                "Bebidas Alcohólicas", "Distribuidora de Vinos y Licores del Valle", 215.00, 61);
        pancho.registrarProducto(inventario, "7500097882081", "Ron Appleton Estate Signature 750ml",
                "Bebidas Alcohólicas", "Distribuidora de Vinos y Licores del Valle", 320.00, 56);
        pancho.registrarProducto(inventario, "7502191361939", "Brandy Torres 10 700ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 310.00, 38);
        pancho.registrarProducto(inventario, "7509091699854", "Brandy Presidente 950ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 190.00, 27);
        pancho.registrarProducto(inventario, "7503534624751", "Ginebra Tanqueray London Dry 750ml",
                "Bebidas Alcohólicas", "Distribuidora de Vinos y Licores del Valle", 510.00, 75);
        pancho.registrarProducto(inventario, "7500799118384", "Ginebra Bombay Sapphire 750ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 580.00, 73);
        pancho.registrarProducto(inventario, "7502513542784",
                "Vino Tinto Casillero del Diablo Cabernet Sauvignon 750ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 240.00, 21);
        pancho.registrarProducto(inventario, "7509808412411", "Vino Tinto Las Moras Malbec 750ml",
                "Bebidas Alcohólicas", "Distribuidora de Vinos y Licores del Valle", 185.00, 16);
        pancho.registrarProducto(inventario, "7508244935348", "Vino Blanco Diamante Semidulce 750ml",
                "Bebidas Alcohólicas", "Distribuidora de Vinos y Licores del Valle", 210.00, 24);
        pancho.registrarProducto(inventario, "7507401640052", "Licor Baileys Original Irish Cream 700ml",
                "Bebidas Alcohólicas", "Distribuidora de Vinos y Licores del Valle", 420.00, 29);
        pancho.registrarProducto(inventario, "7504278680112", "Licor Jagermeister 700ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 450.00, 30);
        pancho.registrarProducto(inventario, "7508059826204", "Licor Kahlúa de Café 980ml", "Bebidas Alcohólicas",
                "Distribuidora de Vinos y Licores del Valle", 290.00, 64);
        pancho.registrarProducto(inventario, "7505053315869", "Carajillo Corajito Licor de Café 100ml",
                "Bebidas Alcohólicas", "Distribuidora de Vinos y Licores del Valle", 75.00, 18);
        pancho.registrarProducto(inventario, "7509552876376", "Desodorante obao tattoo ( 150ml )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 54.90, 59);
        pancho.registrarProducto(inventario, "7506306209732", "Desodorante savile sábila y agua de rosas ( 150 ml )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 54.90, 58);
        pancho.registrarProducto(inventario, "7502221186080", "Antitranspirante ammens soft cotton ( 142ml )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 64.90, 69);
        pancho.registrarProducto(inventario, "7501082731064", "Desodorante Nuvel Softy ( 170 ml )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 47.90, 77);
        pancho.registrarProducto(inventario, "7501056330262", "Crema Anti-Manchas Pond's Clarant B3 ( 100 g )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 94.90, 42);
        pancho.registrarProducto(inventario, "7501056326142", "Crema Humectante Pond's Crema S ( 100g )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 69.90, 80);
        pancho.registrarProducto(inventario, "7501022104217", "Crema facial Concha Nácar Grisi ( 110g )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 69.90, 11);
        pancho.registrarProducto(inventario, "7501361156007", "Crema Concha Nácar Avant ( 90g )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 25.90, 24);
        pancho.registrarProducto(inventario, "7500326384028", "Crema de Aloe Vera Sabi ( 250ml )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 114.90, 78);
        pancho.registrarProducto(inventario, "7702031244486", "Crema Corporal Lubridem Humectación Diaria ( 120ml )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 44.90, 44);
        pancho.registrarProducto(inventario, "7702035416155", "Crema Lubridem Protección Solar FPS 15 ( 200 ml )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 64.90, 53);
        pancho.registrarProducto(inventario, "7702031244554", "Crema Lubridem Humectación delicada ( 400 ML )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 129.90, 24);
        pancho.registrarProducto(inventario, "7319470058071", "Crema Corporal Nivea Men Revitalizante ( 500ml )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 164.90, 47);
        pancho.registrarProducto(inventario, "7501054528333", "Crema corporal Nivea protección solar FPS 15 ( 400ml )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 149.90, 65);
        pancho.registrarProducto(inventario, "7501054504535", "Crema corporal Nivea milk nutritiva ( 400ml )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 124.90, 30);
        pancho.registrarProducto(inventario, "7501054500193", "Nivea Creme ( 200ml )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 124.90, 68);
        pancho.registrarProducto(inventario, "7501082721676", "Crema Humectante Nuvel Miel y Avena ( 750 ML )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 42.50, 10);
        pancho.registrarProducto(inventario, "7501878707990", "Crema Corporal Skinh20 Hidratación y Suavidad ( 385ml )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 32.90, 43);
        pancho.registrarProducto(inventario, "7502258448816", "Crema corporal Pop Life Lets be Wild ( 200ml )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 27.90, 74);
        pancho.registrarProducto(inventario, "7509552876390", "Desodorante Aerosol Obao Tattoo Aqua Fresh ( 150ml )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 54.90, 32);
        pancho.registrarProducto(inventario, "7501080953970", "Desodorante Barra Arm & Hammer Ultra Max ( 73g )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 99.90, 74);
        pancho.registrarProducto(inventario, "7501361130557", "Talco desodorante D-Dolex Shadow ( 150g )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 25.90, 23);
        pancho.registrarProducto(inventario, "7501044217964", "Talco desodorante Olorex Mentol ( 200g )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 64.90, 48);
        pancho.registrarProducto(inventario, "7501044217841", "Talco Desodorante Olorex Clásico ( 330g )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 64.90, 74);
        pancho.registrarProducto(inventario, "7501044205428", "Talco desodorante Olormax ICE ( 150g )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 21.90, 35);
        pancho.registrarProducto(inventario, "8410190589568", "Talco perfumado Maja España Clásico ( 100g )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 54.90, 29);
        pancho.registrarProducto(inventario, "37836092916", "Talco perfumado Maja España Flor de Ciruelo ( 100g )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 52.90, 57);
        pancho.registrarProducto(inventario, "7702010631207", "Colgate Triple Acción pack 2 cepillos ( 2pzs )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 29.90, 30);
        pancho.registrarProducto(inventario, "7500435143790", "Oral-B Purification pack 2 ( 2pzs )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 89.90, 79);
        pancho.registrarProducto(inventario, "7500435250887", "Oral-B Clean Pack Familia ( 4pzs )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 49.90, 77);
        pancho.registrarProducto(inventario, "7500435155847", "Shampoo control caída Pantene ( 400 ml )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 94.90, 10);
        pancho.registrarProducto(inventario, "7500435193788",
                "Shampoo Granada y proteína vegana herbal essences ( 400 ml )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 84.90, 51);
        pancho.registrarProducto(inventario, "7506306249240", "Shampoo Savile fuerza y reparación ( 700 ml )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 37.50, 72);
        pancho.registrarProducto(inventario, "7509552961478", "Shampoo liso efecto keratina l'oréal París ( 680 ml )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 94.90, 12);
        pancho.registrarProducto(inventario, "7506306254688", "Acondicionador luminus sedal ( 620 ml )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 94.90, 24);
        pancho.registrarProducto(inventario, "7506306248229", "Shampoo Yuya micelar sedal ( 620 ml )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 89.90, 56);
        pancho.registrarProducto(inventario, "7509552876611", "Shampoo hair food Piña Fructis ( 300 ml )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 89.90, 49);
        pancho.registrarProducto(inventario, "7500435193733", "Shampoo classic Lavanda Herbal essences ( 400 ml )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 84.90, 40);
        pancho.registrarProducto(inventario, "7500435184731", "Shampoo classic cconut wat Herbal essences ( 400 ml )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 84.90, 17);
        pancho.registrarProducto(inventario, "65024007296", "Champú y enjuague rosa anticaída van art ( 750 ml )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 59.90, 40);
        pancho.registrarProducto(inventario, "7501082715736", "Shampoo manzana novel ( 60 ml )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 39.90, 20);
        pancho.registrarProducto(inventario, "7500435193740", "Acondicionador classics Lavanda Herbal ess ( 240 ml )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 49.90, 20);
        pancho.registrarProducto(inventario, "7509552844207", "Acondicionador Hair food Fructis ( 300 ml )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 79.90, 72);
        pancho.registrarProducto(inventario, "7509552928617", "Acondicionador Glyco Gloss Elvive ( 370 ml )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 94.90, 18);
        pancho.registrarProducto(inventario, "7506306248250", "Acondicionador probióticos y biotina Sedal ( 620 ml )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 59.90, 78);
        pancho.registrarProducto(inventario, "7500435248044", "Acondicionador anticaída biotinamina Pantene ( 700 ml )",
                "Higiene", "Comercializadora Cuidado Personal SA de CV", 139.90, 26);
        pancho.registrarProducto(inventario, "7500435184724",
                "Acondicionador classics Cconut Herbal essences ( 400 ml )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 84.90, 26);
        pancho.registrarProducto(inventario, "7500435252997",
                "Acondicionador classics Granada herbal essences ( 240 ml )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 49.50, 70);
        pancho.registrarProducto(inventario, "7500435241106", "Acondicionador keratina Pantene ( 250 ml )", "Higiene",
                "Comercializadora Cuidado Personal SA de CV", 94.90, 80);
        pancho.registrarProducto(inventario, "7501000610335", "Pulparindo Clásico", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 4.50, 31);
        pancho.registrarProducto(inventario, "7501000612148", "Pulparindo Sandía", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 4.50, 43);
        pancho.registrarProducto(inventario, "7501000612131", "Pulparindo Mango", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 4.50, 77);
        pancho.registrarProducto(inventario, "7501000612124", "Pulparindo Extra Picante", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 4.50, 64);
        pancho.registrarProducto(inventario, "7501035911149", "Pelón Pelo Rico Original", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 11.00, 37);
        pancho.registrarProducto(inventario, "7501035911132", "Pelón Pelo Rico Tamarindo", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 11.00, 79);
        pancho.registrarProducto(inventario, "7501015839215", "Lucas Muecas Mango", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 14.50, 35);
        pancho.registrarProducto(inventario, "7501015839222", "Lucas Muecas Chamoy", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 14.50, 49);
        pancho.registrarProducto(inventario, "7501015839253", "Lucas Muecas Pepino", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 14.50, 61);
        pancho.registrarProducto(inventario, "7501015841126", "Lucas Gusano Tamarindo", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 13.50, 57);
        pancho.registrarProducto(inventario, "7501030467576", "Skwinkles Salsagheti", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 16.00, 66);
        pancho.registrarProducto(inventario, "7501030467729", "Skwinkles Clásico", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 13.50, 76);
        pancho.registrarProducto(inventario, "7501020617300", "Pica Gomas Fresa", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 1.50, 67);
        pancho.registrarProducto(inventario, "7501020617317", "Pica Gomas Mango", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 1.50, 25);
        pancho.registrarProducto(inventario, "7501791610488", "Tamborines Tamarindo", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 1.50, 41);
        pancho.registrarProducto(inventario, "7502220410058", "Banderillas de Tamarindo Chaca Chaca", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 6.00, 38);
        pancho.registrarProducto(inventario, "7501011197305", "Cacahuate Japonés con Chile Mafer", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 20.00, 18);
        pancho.registrarProducto(inventario, "7502253451670", "Gomitas Mangomitas", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 16.50, 53);
        pancho.registrarProducto(inventario, "7501030491083", "Bolitochas Sandía", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 2.00, 12);
        pancho.registrarProducto(inventario, "7501000610052", "Mazapán Clásico De la Rosa", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 5.50, 80);
        pancho.registrarProducto(inventario, "7501000610267", "Mazapán Gigante De la Rosa", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 13.50, 39);
        pancho.registrarProducto(inventario, "7501000610816", "Mazapán con Chocolate De la Rosa", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 11.00, 38);
        pancho.registrarProducto(inventario, "7503017551016", "Alegría con Miel y Amaranto Tía Trini", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 13.50, 10);
        pancho.registrarProducto(inventario, "7501314600109", "Glorias de Linares Las Sevillanas", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 16.50, 19);
        pancho.registrarProducto(inventario, "7501058229986", "Obleas con Cajeta Mini Coronado", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 9.00, 17);
        pancho.registrarProducto(inventario, "7501058200503", "Obleas Grandes con Cajeta Coronado", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 27.50, 39);
        pancho.registrarProducto(inventario, "7501017013110", "Ate de Membrillo La Costeña", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 41.50, 18);
        pancho.registrarProducto(inventario, "7501515400030", "Ate de Guayaba Don Vasco", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 50.00, 14);
        pancho.registrarProducto(inventario, "7502213150044", "Borrachitos Surtidos La Colmena", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 40.00, 52);
        pancho.registrarProducto(inventario, "7502221629084", "Cocada Tradicional en barra Pinea", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 13.50, 19);
        pancho.registrarProducto(inventario, "7501020610059", "Paleta Vero Mango", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 4.50, 75);
        pancho.registrarProducto(inventario, "7501020610202", "Paleta Vero Elote", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 4.50, 40);
        pancho.registrarProducto(inventario, "7501020610141", "Paleta Vero Manita", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 4.00, 45);
        pancho.registrarProducto(inventario, "7501030456174", "Paleta Rockaleta", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 7.00, 72);
        pancho.registrarProducto(inventario, "7501000610229", "Paleta Tarrito de Cerveza De la Rosa", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 4.00, 37);
        pancho.registrarProducto(inventario, "7501030454071", "Paleta Payaso", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 21.00, 79);
        pancho.registrarProducto(inventario, "7612700301874", "Paleta Chupa Chups Surtida", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 6.00, 26);
        pancho.registrarProducto(inventario, "7501008101569", "Paleta Tutsi Pop", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 5.00, 70);
        pancho.registrarProducto(inventario, "7501008107950", "Caramelo Gudu Pop Surtido", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 2.50, 41);
        pancho.registrarProducto(inventario, "7501039800039", "Pastillas Fruticas Astro", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 9.00, 70);
        pancho.registrarProducto(inventario, "7501058622176", "Chocolate Carlos V", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 12.00, 62);
        pancho.registrarProducto(inventario, "7501058622183", "Chocolate Carlos V Stick", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 5.00, 34);
        pancho.registrarProducto(inventario, "7501031301015", "Choco Milk en polvo", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 50.00, 22);
        pancho.registrarProducto(inventario, "7501030438316", "Chocotorro Wonder", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 19.00, 22);
        pancho.registrarProducto(inventario, "7501000115045", "Gansito Marinela", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 19.50, 65);
        pancho.registrarProducto(inventario, "7501000114994", "Pingüinos Marinela", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 21.50, 55);
        pancho.registrarProducto(inventario, "7501000109969", "Chocólosos Marinela", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 18.50, 64);
        pancho.registrarProducto(inventario, "7501000110019", "Suavicrema Marinela", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 18.00, 62);
        pancho.registrarProducto(inventario, "7501000632313", "Galletas Emperador Chocolate", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 20.50, 69);
        pancho.registrarProducto(inventario, "7501000632337", "Galletas Emperador Combinado", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 20.50, 16);
        pancho.registrarProducto(inventario, "7501000613012", "Galletas Marías Gamesa", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 17.00, 22);
        pancho.registrarProducto(inventario, "7501000614019", "Galletas Arcoíris Gamesa", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 20.00, 17);
        pancho.registrarProducto(inventario, "7501000616112", "Galletas Chokis Gamesa", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 21.50, 61);
        pancho.registrarProducto(inventario, "7501030453081", "Duvalin Avellana / Vainilla", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 4.00, 53);
        pancho.registrarProducto(inventario, "7501030453098", "Duvalin Fresa / Vainilla", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 4.00, 23);
        pancho.registrarProducto(inventario, "7501026611081", "Chicles Canel's Surtidos", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 1.50, 41);
        pancho.registrarProducto(inventario, "7622201083946", "Goma de Mascar Bubbaloo Fresa", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 1.50, 34);
        pancho.registrarProducto(inventario, "7622201083984", "Goma de Mascar Bubbaloo Uva", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 1.50, 34);
        pancho.registrarProducto(inventario, "7501030485013", "Gomitas Panditas Clásicos", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 14.50, 78);
        pancho.registrarProducto(inventario, "7501030485037", "Gomitas Panditas Ácidos", "Dulcería",
                "Dulces y Golosinas Mexicanas S.A.", 14.50, 67);
        pancho.registrarProducto(inventario, "7501020550733", "Leche Entera (Lala)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 56.00, 27);
        pancho.registrarProducto(inventario, "7501295600126", "Leche deslactosada (Santa Clara)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 30.00, 64);
        pancho.registrarProducto(inventario, "7501020565959", "Leche Semidescremada (Lala)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 40.50, 33);
        pancho.registrarProducto(inventario, "7501058644862", "Leche en polvo (Nestlé)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 20.00, 45);
        pancho.registrarProducto(inventario, "7501040092169", "Yogurt de beber Fresa - 220 g (Yoplait)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 35.00, 69);
        pancho.registrarProducto(inventario, "7501020567007", "Yomi de vainilla (Lala )", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 37.00, 41);
        pancho.registrarProducto(inventario, "7506475104722", "Leche Condensada La Lechera Original - 375 gr (Nestlé)",
                "Lacteos", "Grupo Lala / Lacteos del Bajío", 32.10, 19);
        pancho.registrarProducto(inventario, "7501058611062", "Leche evaporada (Carnation)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 22.00, 66);
        pancho.registrarProducto(inventario, "7501058642141",
                "Sustituto de Cream Coffee Mate Avellana Líquido - 530 g (Nestlé )", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 46.50, 80);
        pancho.registrarProducto(inventario, "7501770920046", "Crema para batir (Saborex)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 59.00, 22);
        pancho.registrarProducto(inventario, "7501055916030", "Crema Deslactosada - 426ml (Alpura)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 50.00, 16);
        pancho.registrarProducto(inventario, "7501058638076", "Media crema (Nestlé)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 45.00, 79);
        pancho.registrarProducto(inventario, "7503006791123",
                "Queso Chester de leche entera y pasteurizada - 1 kg (Queso Menonita)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 492.00, 11);
        pancho.registrarProducto(inventario, "7501020537970", "Mantequilla sin sal (Lala)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 109.00, 21);
        pancho.registrarProducto(inventario, "7501002204326", "Queso fresco reducido en grasa - 360g (Zwan)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 70.90, 40);
        pancho.registrarProducto(inventario, "7503004987238", "Queso cotija (Del parral)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 83.00, 31);
        pancho.registrarProducto(inventario, "7501020514537", "Queso Panela Light - 400 g (Lala)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 94.00, 62);
        pancho.registrarProducto(inventario, "7501303914214", "Queso canasto (Chilchota)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 45.00, 72);
        pancho.registrarProducto(inventario, "7501040080319", "Queso Oaxaca - 200g (La Villita)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 45.00, 71);
        pancho.registrarProducto(inventario, "7502261880078", "Queso asadero (San Roque)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 127.00, 37);
        pancho.registrarProducto(inventario, "7501020546897", "Queso Manchego Rebanado - 400g (Lala)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 129.00, 61);
        pancho.registrarProducto(inventario, "7503005898410", "Requesón (Bionda)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 130.00, 17);
        pancho.registrarProducto(inventario, "21000612239", "Queso Crema Original - 8 oz (Philadelphia)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 160.00, 31);
        pancho.registrarProducto(inventario, "7501032397951", "Danonio de fresa (Danone)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 48.00, 58);
        pancho.registrarProducto(inventario, "7501055918003", "Queso Americano Rebanado - 144g (Alpura)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 28.50, 10);
        pancho.registrarProducto(inventario, "7501669805164", "Queso Mozzarella (Esmeralda)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 90.00, 59);
        pancho.registrarProducto(inventario, "7501055910250",
                "Leche Clásica Descremada Ultrapasteurizada - 1.5 L (Alpura)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 54.50, 43);
        pancho.registrarProducto(inventario, "7501032601133", "Queso chedar líquido (Del rancho)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 202.90, 68);
        pancho.registrarProducto(inventario, "840370900445", "Queso Parmesano Rallado - 227 g (Kraft)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 152.00, 46);
        pancho.registrarProducto(inventario, "7503020261930", "Queso de cabra con jalapeño (Mi passion)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 180.00, 64);
        pancho.registrarProducto(inventario, "7501040075650", "Yoghurt griego natural - 120 g (Yoplait)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 15.00, 72);
        pancho.registrarProducto(inventario, "2350972005274", "Queso Maduro (Entrepinares)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 105.00, 29);
        pancho.registrarProducto(inventario, "7501025511036",
                "Yakult Bebida Láctea Fermentada - 3 pzas de 80 ml c/u (Yakult)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 29.00, 34);
        pancho.registrarProducto(inventario, "7501040076084", "Yogurt Griego (Yoplait)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 45.00, 47);
        pancho.registrarProducto(inventario, "7501000383320", "Cajeta Quemada Yopi Doy Pack - 250 g (Coronado)",
                "Lacteos", "Grupo Lala / Lacteos del Bajío", 28.30, 37);
        pancho.registrarProducto(inventario, "7501055914838", "Yogurt de durazno (Alpura)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 12.50, 17);
        pancho.registrarProducto(inventario, "7506306417854", "Helado Cremissimo Vainilla - 900 ml.(Holanda)",
                "Lacteos", "Grupo Lala / Lacteos del Bajío", 80.50, 79);
        pancho.registrarProducto(inventario, "7501032300098", "Yogurt de Nuez (Danone)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 27.00, 17);
        pancho.registrarProducto(inventario, "7501020512908", "Flan vainilla - 200 g (Lala)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 18.50, 50);
        pancho.registrarProducto(inventario, "8414807550149", "Kéfir de leche (Consum)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 92.00, 17);
        pancho.registrarProducto(inventario, "7501020540628",
                "Arroz con leche pack - 4 piezas de 125 g c/u 500 g (Lala)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 42.00, 16);
        pancho.registrarProducto(inventario, "7506475104746", "Dulce de leche (Nestlé)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 35.00, 71);
        pancho.registrarProducto(inventario, "7501055900060", "Leche Chocolate 1 L (Alpura)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 36.00, 74);
        pancho.registrarProducto(inventario, "7506306417717", "Helado de chocolate (Holanda)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 68.00, 77);
        pancho.registrarProducto(inventario, "75030896", "Natilla sabor chocolate - 100 g (Danone)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 11.00, 30);
        pancho.registrarProducto(inventario, "7501020565867", "Natilla de vainilla (Lala)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 25.00, 17);
        pancho.registrarProducto(inventario, "7501020552782", "Yoghurt Delicias Pay de Limón - 150 gr (Lala)",
                "Lacteos", "Grupo Lala / Lacteos del Bajío", 23.10, 75);
        pancho.registrarProducto(inventario, "7702001019779", "Pudin de leche (Alpina)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 13.00, 20);
        pancho.registrarProducto(inventario, "7502209117075", "Jocoque Seco Natural (Libanius)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 159.00, 33);
        pancho.registrarProducto(inventario, "7501024599356", "chocolate de fresa (Hershey's)", "Lacteos",
                "Grupo Lala / Lacteos del Bajío", 15.00, 18);
        pancho.registrarProducto(inventario, "7509900000019", "iPhone 15 Pro Max", "Electrónicos",
                "TecnoImport de México", 25999.00, 18);
        pancho.registrarProducto(inventario, "7509900000026", "Galaxy S24 Ultra", "Electrónicos",
                "TecnoImport de México", 26999.00, 40);
        pancho.registrarProducto(inventario, "7509900000033", "PlayStation 5 Slim", "Electrónicos",
                "TecnoImport de México", 9999.00, 61);
        pancho.registrarProducto(inventario, "7509900000040", "Nintendo Switch OLED", "Electrónicos",
                "TecnoImport de México", 5999.00, 25);
        pancho.registrarProducto(inventario, "7509900000057", "iPad Pro M4", "Electrónicos", "TecnoImport de México",
                21999.00, 41);
        pancho.registrarProducto(inventario, "7509900000064", "MacBook Air M3", "Electrónicos", "TecnoImport de México",
                22999.00, 15);
        pancho.registrarProducto(inventario, "7509900000071", "Audífonos WH-1000XM5", "Electrónicos",
                "TecnoImport de México", 6499.00, 20);
        pancho.registrarProducto(inventario, "7509900000088", "Kindle Paperwhite", "Electrónicos",
                "TecnoImport de México", 3499.00, 63);
        pancho.registrarProducto(inventario, "7509900000095", "Meta Quest 3", "Electrónicos", "TecnoImport de México",
                10499.00, 76);
        pancho.registrarProducto(inventario, "7509900000101", "ROG Ally", "Electrónicos", "TecnoImport de México",
                13999.00, 50);
        pancho.registrarProducto(inventario, "7509900000118", "Chromecast con Google TV", "Electrónicos",
                "TecnoImport de México", 999.00, 43);
        pancho.registrarProducto(inventario, "7509900000125", "Apple Watch Series 9", "Electrónicos",
                "TecnoImport de México", 8999.00, 36);
        pancho.registrarProducto(inventario, "7509900000132", "Galaxy Watch 6", "Electrónicos", "TecnoImport de México",
                5499.00, 50);
        pancho.registrarProducto(inventario, "7509900000149", "Cámara HERO12 Black", "Electrónicos",
                "TecnoImport de México", 7999.00, 40);
        pancho.registrarProducto(inventario, "7509900000156", "Teclado Mecánico K2 V2", "Electrónicos",
                "TecnoImport de México", 1899.00, 43);
        pancho.registrarProducto(inventario, "7509900000163", "Mouse MX Master 3S", "Electrónicos",
                "TecnoImport de México", 2199.00, 60);
        pancho.registrarProducto(inventario, "7509900000170", "Stream Deck MK.2", "Electrónicos",
                "TecnoImport de México", 3199.00, 26);
        pancho.registrarProducto(inventario, "7509900000187", "Bocina Era 100", "Electrónicos", "TecnoImport de México",
                4999.00, 48);
        pancho.registrarProducto(inventario, "7509900000194", "Echo Dot 5ta Generación", "Electrónicos",
                "TecnoImport de México", 999.00, 68);
        pancho.registrarProducto(inventario, "7509900000200", "Shield TV Pro", "Electrónicos", "TecnoImport de México",
                4299.00, 50);
        pancho.registrarProducto(inventario, "7509900000217", "Fire TV Stick 4K", "Electrónicos",
                "TecnoImport de México", 1199.00, 19);
        pancho.registrarProducto(inventario, "7509900000224", "Galaxy Tab S9", "Electrónicos", "TecnoImport de México",
                15999.00, 11);
        pancho.registrarProducto(inventario, "7509900000231", "Televisor OLED C3 55\"", "Electrónicos",
                "TecnoImport de México", 24999.00, 68);
        pancho.registrarProducto(inventario, "7509900000248", "Audífonos QuietComfort Ultra", "Electrónicos",
                "TecnoImport de México", 8999.00, 22);
        pancho.registrarProducto(inventario, "7509900000255", "AirPods Pro 2", "Electrónicos", "TecnoImport de México",
                4999.00, 19);
        pancho.registrarProducto(inventario, "7509900000262", "Audífonos Arctis Nova Pro", "Electrónicos",
                "TecnoImport de México", 6999.00, 78);
        pancho.registrarProducto(inventario, "7509900000279", "Mouse DeathAdder V3 Pro", "Electrónicos",
                "TecnoImport de México", 3099.00, 37);
        pancho.registrarProducto(inventario, "7509900000286", "Control DualSense Edge", "Electrónicos",
                "TecnoImport de México", 4799.00, 74);
        pancho.registrarProducto(inventario, "7509900000293", "Xbox Series X", "Electrónicos", "TecnoImport de México",
                11599.00, 43);
        pancho.registrarProducto(inventario, "7509900000309", "Steam Deck OLED", "Electrónicos",
                "TecnoImport de México", 12999.00, 26);
        pancho.registrarProducto(inventario, "7509900000316", "Teclado K70 RGB PRO", "Electrónicos",
                "TecnoImport de México", 3399.00, 54);
        pancho.registrarProducto(inventario, "7509900000323", "Micrófono Blue Yeti USB", "Electrónicos",
                "TecnoImport de México", 2499.00, 18);
        pancho.registrarProducto(inventario, "7509900000330", "SSD M.2 SN850X 2TB", "Electrónicos",
                "TecnoImport de México", 3599.00, 41);
        pancho.registrarProducto(inventario, "7509900000347", "SSD Portátil Extreme 1TB", "Electrónicos",
                "TecnoImport de México", 2199.00, 57);
        pancho.registrarProducto(inventario, "7509900000354", "Dron Mini 4 Pro", "Electrónicos",
                "TecnoImport de México", 16999.00, 46);
        pancho.registrarProducto(inventario, "7509900000361", "Timbre Inteligente Ring", "Electrónicos",
                "TecnoImport de México", 1999.00, 30);
        pancho.registrarProducto(inventario, "7509900000378", "Kit Inicio Hue", "Electrónicos", "TecnoImport de México",
                3999.00, 66);
        pancho.registrarProducto(inventario, "7509900000385", "Cámara Instax Mini 12", "Electrónicos",
                "TecnoImport de México", 1799.00, 79);
        pancho.registrarProducto(inventario, "7509900000392", "Monitor UltraSharp U2723QE", "Electrónicos",
                "TecnoImport de México", 11999.00, 48);
        pancho.registrarProducto(inventario, "7509900000408", "Monitor Gaming VG27AQ", "Electrónicos",
                "TecnoImport de México", 6499.00, 77);
        pancho.registrarProducto(inventario, "7509900000415", "Micrófono QuadCast S", "Electrónicos",
                "TecnoImport de México", 3199.00, 11);
        pancho.registrarProducto(inventario, "7509900000422", "SSD Portátil T7 Shield 2TB", "Electrónicos",
                "TecnoImport de México", 3499.00, 80);
        pancho.registrarProducto(inventario, "7509900000439", "Sistema Wifi Velop Pro 6E", "Electrónicos",
                "TecnoImport de México", 6299.00, 48);
        pancho.registrarProducto(inventario, "7509900000446", "Termostato Nest", "Electrónicos",
                "TecnoImport de México", 4999.00, 23);
        pancho.registrarProducto(inventario, "7509900000453", "Reloj Forerunner 265", "Electrónicos",
                "TecnoImport de México", 8999.00, 27);
        pancho.registrarProducto(inventario, "7509900000460", "Micrófono SM7B", "Electrónicos", "TecnoImport de México",
                8499.00, 43);
        pancho.registrarProducto(inventario, "7509900000477", "Interfaz de Audio Scarlett 2i2", "Electrónicos",
                "TecnoImport de México", 3999.00, 24);
        pancho.registrarProducto(inventario, "7509900000484", "Micrófono Wave:3", "Electrónicos",
                "TecnoImport de México", 3099.00, 23);
        pancho.registrarProducto(inventario, "7509900000491", "SSD M.2 T500 2TB", "Electrónicos",
                "TecnoImport de México", 3299.00, 80);
        pancho.registrarProducto(inventario, "7509900000507", "Batería Portátil 737", "Electrónicos",
                "TecnoImport de México", 2999.00, 29);
        pancho.registrarProducto(inventario, "7501039127476", "Nutrioli / codos 200g", "Pasta",
                "Distribuidora Nacional de Pastas", 16.00, 44);
        pancho.registrarProducto(inventario, "7501018314026", "La moderna / Lasagna 500g", "Pasta",
                "Distribuidora Nacional de Pastas", 24.00, 46);
        pancho.registrarProducto(inventario, "8076809586504", "Barilla / Lasagne 500g", "Pasta",
                "Distribuidora Nacional de Pastas", 32.00, 36);
        pancho.registrarProducto(inventario, "7501018312008", "La moderna / Tallarines queso cheddar 200g", "Pasta",
                "Distribuidora Nacional de Pastas", 23.00, 53);
        pancho.registrarProducto(inventario, "7501018312039", "La moderna / Spaghetti queso cheddar 200g", "Pasta",
                "Distribuidora Nacional de Pastas", 23.00, 36);
        pancho.registrarProducto(inventario, "7501018312145", "La moderna / Spaghetti con crema 200g", "Pasta",
                "Distribuidora Nacional de Pastas", 23.00, 43);
        pancho.registrarProducto(inventario, "7501018312138", "La moderna / Spaghetti con salsa de tomate 200g",
                "Pasta", "Distribuidora Nacional de Pastas", 23.00, 74);
        pancho.registrarProducto(inventario, "8410069040725", "Gallo / Ravioli con queso 250g", "Pasta",
                "Distribuidora Nacional de Pastas", 55.00, 72);
        pancho.registrarProducto(inventario, "8001250201034", "Dececco / Fettuccine 250g", "Pasta",
                "Distribuidora Nacional de Pastas", 101.00, 42);
        pancho.registrarProducto(inventario, "7501039127001", "Nutrioli / Fideo 200g", "Pasta",
                "Distribuidora Nacional de Pastas", 16.00, 16);
        pancho.registrarProducto(inventario, "7501018318000", "La moderna / Rotini 345 g", "Pasta",
                "Distribuidora Nacional de Pastas", 30.00, 21);
        pancho.registrarProducto(inventario, "7501039127117", "Nutrioli / Fusilli de verduras 200g", "Pasta",
                "Distribuidora Nacional de Pastas", 24.00, 64);
        pancho.registrarProducto(inventario, "8076809586503", "Barilla / Spaghetti 200g", "Pasta",
                "Distribuidora Nacional de Pastas", 18.00, 45);
        pancho.registrarProducto(inventario, "8076809585125", "Barilla / conchitas 250g", "Pasta",
                "Distribuidora Nacional de Pastas", 22.00, 15);
        pancho.registrarProducto(inventario, "8076809585118", "Barilla / mini torciditos 250g", "Pasta",
                "Distribuidora Nacional de Pastas", 22.00, 10);
        pancho.registrarProducto(inventario, "3038351480407", "Panzani / cannelloni 250g", "Pasta",
                "Distribuidora Nacional de Pastas", 50.00, 52);
        pancho.registrarProducto(inventario, "8001250001085", "Decceco / Tagliatelle 250g", "Pasta",
                "Distribuidora Nacional de Pastas", 101.00, 26);
        pancho.registrarProducto(inventario, "613963110329", "Fior di pasta / Spaghetti 200g", "Pasta",
                "Distribuidora Nacional de Pastas", 19.00, 43);
        pancho.registrarProducto(inventario, "102487652270", "Yemina / plumilla 2 200g", "Pasta",
                "Distribuidora Nacional de Pastas", 14.00, 30);
        pancho.registrarProducto(inventario, "7501018319311", "De Luigi / Spaghetti 500g", "Pasta",
                "Distribuidora Nacional de Pastas", 22.00, 66);
        pancho.registrarProducto(inventario, "613963110817", "Fior di pasta / conchitas 200g", "Pasta",
                "Distribuidora Nacional de Pastas", 19.00, 80);
        pancho.registrarProducto(inventario, "7501018310691", "La moderna / de señas 200g", "Pasta",
                "Distribuidora Nacional de Pastas", 20.00, 64);
        pancho.registrarProducto(inventario, "7501018323318", "La moderna / edicion especial futbol 200g", "Pasta",
                "Distribuidora Nacional de Pastas", 20.00, 11);
        pancho.registrarProducto(inventario, "7501018319014", "La moderna / codo 2 Integral 200g", "Pasta",
                "Distribuidora Nacional de Pastas", 18.00, 24);
        pancho.registrarProducto(inventario, "7506306321007", "Knorr / Tory tory 115g", "Pasta",
                "Distribuidora Nacional de Pastas", 15.00, 19);
        pancho.registrarProducto(inventario, "7506306320826", "Knorr / Mickey mouse 115g", "Pasta",
                "Distribuidora Nacional de Pastas", 15.00, 29);
        pancho.registrarProducto(inventario, "7501005129954", "Knorr / letras 115g", "Pasta",
                "Distribuidora Nacional de Pastas", 15.00, 79);
        pancho.registrarProducto(inventario, "7501005134002", "Knorr / municiones 115g", "Pasta",
                "Distribuidora Nacional de Pastas", 15.00, 14);
        pancho.registrarProducto(inventario, "7501005129930", "Knorr / Fideos de pollo 115g", "Pasta",
                "Distribuidora Nacional de Pastas", 15.00, 57);
        pancho.registrarProducto(inventario, "7501005129947", "Knorr / estrellas 115g", "Pasta",
                "Distribuidora Nacional de Pastas", 15.00, 80);
        pancho.registrarProducto(inventario, "7506306323711", "Knorr / Mandilorian 115g", "Pasta",
                "Distribuidora Nacional de Pastas", 15.00, 28);
        pancho.registrarProducto(inventario, "7501005107662", "Knorr / Minestrone 120g", "Pasta",
                "Distribuidora Nacional de Pastas", 18.00, 65);
        pancho.registrarProducto(inventario, "7501018315436", "La moderna / Fideo con chipotle 100g", "Pasta",
                "Distribuidora Nacional de Pastas", 20.00, 26);
        pancho.registrarProducto(inventario, "7501018315234", "La moderna / Fideo con tomate 100g", "Pasta",
                "Distribuidora Nacional de Pastas", 20.00, 15);
        pancho.registrarProducto(inventario, "7501011101456", "Sabritas Original Sal 105g", "Sabritas",
                "Pepsico México / Sabritas", 42.00, 49);
        pancho.registrarProducto(inventario, "7501011101463", "Sabritas Adobadas 110g", "Sabritas",
                "Pepsico México / Sabritas", 42.50, 56);
        pancho.registrarProducto(inventario, "7501011101470", "Sabritas Limón y Sal 105g", "Sabritas",
                "Pepsico México / Sabritas", 42.00, 15);
        pancho.registrarProducto(inventario, "7501011101487", "Sabritas Habanero 105g", "Sabritas",
                "Pepsico México / Sabritas", 42.50, 55);
        pancho.registrarProducto(inventario, "7501011101494", "Sabritas Chile y Limón 105g", "Sabritas",
                "Pepsico México / Sabritas", 42.00, 36);
        pancho.registrarProducto(inventario, "7501011116765", "Sabritas Original Sal 42g", "Sabritas",
                "Pepsico México / Sabritas", 22.00, 41);
        pancho.registrarProducto(inventario, "7501011116772", "Sabritas Adobadas 42g", "Sabritas",
                "Pepsico México / Sabritas", 22.50, 23);
        pancho.registrarProducto(inventario, "7501011153448", "Sabritas Crema y Especias 170g", "Sabritas",
                "Pepsico México / Sabritas", 58.00, 55);
        pancho.registrarProducto(inventario, "7501011161597", "Sabritas Receta Crujiente Sal 170g", "Sabritas",
                "Pepsico México / Sabritas", 58.00, 62);
        pancho.registrarProducto(inventario, "7501011161603", "Sabritas Receta Crujiente Adobadas 170g", "Sabritas",
                "Pepsico México / Sabritas", 58.50, 29);
        pancho.registrarProducto(inventario, "7500478000180", "Ruffles Original Sal 120g", "Sabritas",
                "Pepsico México / Sabritas", 42.00, 40);
        pancho.registrarProducto(inventario, "7500478000197", "Ruffles Jalapeño 120g", "Sabritas",
                "Pepsico México / Sabritas", 42.50, 30);
        pancho.registrarProducto(inventario, "7500478030682", "Ruffles Mix Queso / Jalapeño / Limón 170g", "Sabritas",
                "Pepsico México / Sabritas", 59.00, 32);
        pancho.registrarProducto(inventario, "7500478000173", "Ruffles Queso 120g", "Sabritas",
                "Pepsico México / Sabritas", 42.00, 62);
        pancho.registrarProducto(inventario, "7500478002023", "Ruffles Mega Crunch Queso 150g", "Sabritas",
                "Pepsico México / Sabritas", 52.00, 13);
        pancho.registrarProducto(inventario, "7500478002030", "Ruffles Mega Crunch Jalapeño 150g", "Sabritas",
                "Pepsico México / Sabritas", 52.50, 32);
        pancho.registrarProducto(inventario, "7500478000203", "Ruffles Queso 290g", "Sabritas",
                "Pepsico México / Sabritas", 78.00, 52);
        pancho.registrarProducto(inventario, "7500478000210", "Ruffles Original Sal 290g", "Sabritas",
                "Pepsico México / Sabritas", 78.00, 62);
        pancho.registrarProducto(inventario, "7500478000012", "Cheetos Torciditos Queso 120g", "Sabritas",
                "Pepsico México / Sabritas", 42.00, 41);
        pancho.registrarProducto(inventario, "7500478000029", "Cheetos Poffs Queso 115g", "Sabritas",
                "Pepsico México / Sabritas", 42.50, 44);
        pancho.registrarProducto(inventario, "7500478000036", "Cheetos Xtra Flamin’ Hot 145g", "Sabritas",
                "Pepsico México / Sabritas", 52.00, 30);
        pancho.registrarProducto(inventario, "7500478000043", "Cheetos Pelotazos Queso 130g", "Sabritas",
                "Pepsico México / Sabritas", 48.00, 23);
        pancho.registrarProducto(inventario, "7509546018911", "Axion Limón Polvo 250 g", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 15.00, 58);
        pancho.registrarProducto(inventario, "7509546657981", "Axion Limón Líquido 1.4 L", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 71.00, 14);
        pancho.registrarProducto(inventario, "7501035905368", "Fabuloso Fresca Lavanda 2 L", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 45.50, 70);
        pancho.registrarProducto(inventario, "7509546051930", "Axion Limón Líquido 750 ml", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 37.00, 38);
        pancho.registrarProducto(inventario, "7506339304828", "Salvo Limón Líquido 750 ml", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 32.00, 35);
        pancho.registrarProducto(inventario, "7506339323478", "Salvo Power Clean Líquido 1.2 L", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 52.00, 68);
        pancho.registrarProducto(inventario, "7501034869015", "Eficaz Limón Líquido 750 ml", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 30.00, 54);
        pancho.registrarProducto(inventario, "7501034876488", "Cloralex Lavatrastes Aroma Fresco 750 ml",
                "Limpieza Hogar", "Comercializadora de Limpieza y Hogar", 33.00, 49);
        pancho.registrarProducto(inventario, "7509546073422", "Axion Multisuperficies Polvo 720 g", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 45.00, 39);
        pancho.registrarProducto(inventario, "7501021540320", "Pinol El Original 1 L", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 28.00, 38);
        pancho.registrarProducto(inventario, "7501021540498", "Pinol Aromas Lavanda 828 ml", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 35.00, 13);
        pancho.registrarProducto(inventario, "7501034859283", "Flash Multiusos Flores y Bambú 1.2 L", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 30.00, 34);
        pancho.registrarProducto(inventario, "7501035906541", "Fabuloso Mar Fresco 2 L", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 45.50, 61);
        pancho.registrarProducto(inventario, "7501034865000", "Cloralex Suave Aroma 950 ml", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 28.00, 52);
        pancho.registrarProducto(inventario, "7501021540338", "Pinol El Original 5.1 L", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 116.00, 45);
        pancho.registrarProducto(inventario, "7501025410247", "Ensueño Max 2.8L", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 65.00, 18);
        pancho.registrarProducto(inventario, "41220090495", "Detergente Liquido Mi tiendita", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 103.00, 45);
        pancho.registrarProducto(inventario, "12388003955", "Bold 3 Suavizante Suave Frescura", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 73.00, 54);
        pancho.registrarProducto(inventario, "7509546080680", "Suavitel Complete Acqua 2.8L", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 115.00, 75);
        pancho.registrarProducto(inventario, "7501026028205", "Detergente Liquido ropa Foca 3.875L", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 149.00, 61);
        pancho.registrarProducto(inventario, "7509546686141", "Suavitel Suavizante Cuida Diario Acqua",
                "Limpieza Hogar", "Comercializadora de Limpieza y Hogar", 20.00, 78);
        pancho.registrarProducto(inventario, "41220744565", "Detergente Liquido Mi tiendita 830ml", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 20.50, 52);
        pancho.registrarProducto(inventario, "20809126", "Jabon en Barra Fuerza Max 200gr", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 7.50, 13);
        pancho.registrarProducto(inventario, "7501026027956", "Detergente Líquido Blanca Nieves 3.7 lt",
                "Limpieza Hogar", "Comercializadora de Limpieza y Hogar", 142.50, 24);
        pancho.registrarProducto(inventario, "7500435258012", "Detergente Liquido Ariel Revitacolor", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 30.00, 43);
        pancho.registrarProducto(inventario, "12388003986", "Suavizante de telas Bold 3 flores de primavera de 1L",
                "Limpieza Hogar", "Comercializadora de Limpieza y Hogar", 30.00, 32);
        pancho.registrarProducto(inventario, "400004508319", "Detergente para Ropa Color 5L", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 135.00, 43);
        pancho.registrarProducto(inventario, "7500435258050", "Ariel Detergente Líquido Limpieza Profunda 750ml",
                "Limpieza Hogar", "Comercializadora de Limpieza y Hogar", 40.00, 14);
        pancho.registrarProducto(inventario, "7501026026577", "Detergente en polvo Foca biodegradable 250 g",
                "Limpieza Hogar", "Comercializadora de Limpieza y Hogar", 10.60, 23);
        pancho.registrarProducto(inventario, "7501199413853", "Detergente Liquido 123 Fresca Blancura 4.65L",
                "Limpieza Hogar", "Comercializadora de Limpieza y Hogar", 162.00, 65);
        pancho.registrarProducto(inventario, "7503051868276", "Pato 18g", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 16.90, 54);
        pancho.registrarProducto(inventario, "7501199419442", "Bref 100g", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 32.00, 50);
        pancho.registrarProducto(inventario, "7503032813073", "Wow clean 20g", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 42.00, 65);
        pancho.registrarProducto(inventario, "7506261001648", "Diaqua 50g", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 38.00, 75);
        pancho.registrarProducto(inventario, "51141384788", "Scotch brite 1pz", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 15.00, 24);
        pancho.registrarProducto(inventario, "7501058716538", "Harpic 650ml", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 40.00, 59);
        pancho.registrarProducto(inventario, "7501058713421", "Harpic baños ultra 659ml", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 50.00, 34);
        pancho.registrarProducto(inventario, "7501025401757", "Cloralex baños 750ml", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 58.00, 42);
        pancho.registrarProducto(inventario, "7706800643258", "Mr. Musculo 500ml", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 63.00, 15);
        pancho.registrarProducto(inventario, "7501025401719", "Cloralex totalpower 750ml", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 58.00, 65);
        pancho.registrarProducto(inventario, "7502267450046", "Storm destapacaños 900ml", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 65.00, 10);
        pancho.registrarProducto(inventario, "7503055129236", "Pato gel floral 710ml", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 76.00, 76);
        pancho.registrarProducto(inventario, "722429320803", "Bang 926ml", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 49.90, 78);
        pancho.registrarProducto(inventario, "7501058758163", "Harpic 35g", "Limpieza Hogar",
                "Comercializadora de Limpieza y Hogar", 18.50, 35);
        inventario.silencioso = false;
    }
}