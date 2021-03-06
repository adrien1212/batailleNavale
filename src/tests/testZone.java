/*
 * testZone.java                                                  16 mai 2019
 * IUT info1 2018-2019 groupe 1, aucun droits : ni copyright ni copyleft 
 */
package tests;


import java.util.ArrayList;

import bataille.Bateau;
import bataille.Coordonnee;
import bataille.Flotte;
import bataille.Zone;

/**
 * Test unitaire de Zone
 * @author Adrien
 *
 */
public class testZone {

    /** Zone de jeu par default pour les tests */
    private static Zone zoneJeu = new Zone();
    
//    /** Coordonn�es de zone de d�part */
//    private static  Coordonnee[] CoordonneeDepart =  {
//            new Coordonnee(0, 0),
//            new Coordonnee(-0, -0),
//            new Coordonnee(3, 6),
//            new Coordonnee(3, 8),
//            new Coordonnee(1, 1),
//            new Coordonnee(1, 1),
//            new Coordonnee(0, 8),
//            new Coordonnee(1, 9),
//            new Coordonnee(2, 0),
//            new Coordonnee(9,9)      // mettre taille defaut
//    };
    
    /** Coordonn�e de d�part des bateaux*/
    private static Coordonnee[] coordDepart = {
            new Coordonnee(5, 8),
            new Coordonnee(5, 3),
            new Coordonnee(5, 3),
            new Coordonnee(3, 3),
            new Coordonnee(3, 3),
    };
    
    /** Coordonn�e d'arrive des bateaux */
    private static Coordonnee[] coordArrive = {
            new Coordonnee(7, 8),
            new Coordonnee(5, 6),
            new Coordonnee(5, 7),
            new Coordonnee(6, 3),
            new Coordonnee(3, 5),
    };
    
    /** Bateaux */
    private static Bateau[] bateauPourTest = {
        new Bateau(new Coordonnee(0, 0), new Coordonnee(3, 0), 0, zoneJeu),
        new Bateau(new Coordonnee(8, 7), new Coordonnee(8, 7), 1, zoneJeu),
        new Bateau(new Coordonnee(3, 2), new Coordonnee(3, 5), 2, zoneJeu),
    };
    
//    /**
//     * Tester si une zone se cr�e correctement
//     * On v�rifie si la coordonn�e d'arriv� de la zone est correcte  
//     */
//    public static void testCreationZone() {
//        int nbEchecs;
//        boolean coordArriveeValide; // indique si la coordonn�e d'arriv�e est valide
//
//        /* Taille horizontale pour la zone de test */
//        int[] tailleHorizontale = {
//            0, 8, -2, 6, 100, 9999999, -9654, -0,    -2, 1
//        };
//        
//        /* Taille verticale pour la zone de test */
//        int [] tailleVerticale = {
//            0, -9, 8, 6, 7,    100,     6565, -9896, -0, 1
//        };
//        
//        /* Coordonn�e horizontale (abscisse) attendu pour la zone de test
//         * si -1 alors aucune coordonn�e attendue
//         */
//        int [] coordArriveXAttendue = {
//            0, -1, 1, 9, -1, -1, -1, -1, 0, 10  
//        };
//        
//        /* Coordonn�e verticale (ordonn�e) attendu pour la zone de test
//         * si -1 alors aucune coordonn�e attendue
//         */
//        int [] coordArriveYAttendue = {
//            0, -1, 14, 14, -1, -1, -1, -1, 0, 10
//        };
//        
//        /* R�sultat attendu pour des tests */
//        boolean[] resultatAttendu = {
//            true, false, true, true, false, false, false, false, true, true
//        };
//        
//        nbEchecs = 0;
//        System.out.println("*** Test de cr�ation de zone ***");
//        for (int i = 0; i < CoordonneeDepart.length; i++) {
//            try {
//                Zone zoneATester = new Zone(CoordonneeDepart[i], tailleHorizontale[i], tailleVerticale[i]);
//                coordArriveeValide = true;
//                if(coordArriveeValide) {
//                    if (zoneATester.getCoordArrivee().getX() != coordArriveXAttendue[i] 
//                            || zoneATester.getCoordArrivee().getY() != coordArriveYAttendue[i]) {
//                        nbEchecs++;
//                    }
//                }
//            } catch (IllegalArgumentException coordonneesNegative) {
//                coordArriveeValide = false; 
//            }
//  
//                 
//        }
//        System.out.println("Nb echecs Creation Zone: " + nbEchecs);
//    }
//    
//    
//    /**
//     * Test unitaire de la m�thode horsZone
//     * @param zoneContenant zone contenant la zone
//     */
//    public static void testHorsZone(Zone zoneContenant) {
//        int nbEchecs;  // nombre d'echecs des tests
//        
//        /* Taille horizontale pour la zone de test */
//        int[] tailleHorizontale = {
//                0, 3, 3, 0, 10, 11, 20, 20
//            };
//          
//        /* Taille verticale pour la zone de test */
//        int [] tailleVerticale = {
//                0, 3, 0, 3, 10, 11,  0,  0
//            };
//
//        /* R�sultat attendu pour des tests */
//        boolean[][] resulatAttendu = {
//                {false, false, false, false, false, true, true, true},
//                {false, false, false, false, true, true, true, true }
//        };
//
//        nbEchecs = 0;
//        System.out.println("*** Test de horsZone ***");
//        for (int i = 0 ; i < tailleHorizontale.length; i++) {
//            Zone zoneATester = new Zone(CoordonneeDepart[0], tailleHorizontale[i],
//                                     tailleVerticale[i]);
//
//            if (zoneATester.horsZone(zoneJeu) != resulatAttendu[0][i]) {
//                nbEchecs++;
//            }
//        }
//        
//        for (int i = 0 ; i < tailleHorizontale.length; i++) {
//            Zone zoneATester = new Zone(CoordonneeDepart[2], tailleHorizontale[i],
//                                     tailleVerticale[i]);
//
//            if (zoneATester.horsZone(zoneJeu) != resulatAttendu[1][i]) {
//                nbEchecs++;
//            }
//        }
//        System.out.println("Nb echecs horsZone " + nbEchecs);
//  
//    }
//    
//    
//    /**
//     * Test unitaire de ajouterCoordonnee
//     */
//    public static void testAjouterCoordonnee() {
//        ArrayList<Coordonnee> zoneCoord2; // liste o� seront ajouter les coordonn�es
//        
//        /* Coordonn�es � ajouter � la liste */
//        
//        
//    }
//    
//    
//    /** 
//     * Test unitaire de ajouterCoordonnee(Bateau)
//     */
//    public static void testAjouterCoordonneeAvecBateau() {
//        ArrayList<Coordonnee> zoneCoord; // liste o� seront ajouter les coordonn�es
//        
//        for (int i = 0; i < bateauPourTest.length; i++) {
//            zoneCoord.ajouterCoordonnee(bateauPourTest[i].getZoneContenu());
//        }
//    }
    
   
    /**
     * Test visuel de getZoneCoord
     * Retour valide = coordonn�e bateau + coordonn�e zoneAbordage
     * si la zone est un bateau
     */
    public static void testGetZoneCoord() {
        for (int i = 0; i < bateauPourTest.length; i++) {
            System.out.println(bateauPourTest[i].getZoneCoord());
            System.out.println(bateauPourTest[i].getZoneContenu().get(0));
        }
    }
    
    /**
     * Test unitaire de collision
     */
    public static void testCollision() {
        int nbEchecs;
        
        /* Coordonn�e de d�part des bateaux*/
        Coordonnee[] coordDepart = {
                new Coordonnee(5, 8),
                new Coordonnee(5, 3),
                new Coordonnee(5, 3),
                new Coordonnee(3, 3),
                new Coordonnee(3, 3),
        };
        
        /* Coordonn�e d'arrive des bateaux */
        Coordonnee[] coordArrive = {
                new Coordonnee(7, 8),
                new Coordonnee(5, 6),
                new Coordonnee(5, 7),
                new Coordonnee(6, 3),
                new Coordonnee(3, 5),
        };


        /* r�culats attendus */
        boolean[] resultatAttendu = {
                false, true, true, true, true
        };
        
        /* Placement d'un bateau de la zone de jeu*/
        Bateau bateauPlace = new Bateau(new Coordonnee(4, 4), new Coordonnee(7, 4), 
                0, zoneJeu);

        zoneJeu.ajouterCoordonnee(bateauPlace); // ajout du bateau sur la zone de jeu


        System.out.println("*** Test collision ***");
        nbEchecs = 0;
        /* On regarde si les nouveaux bateaux touchent le bateau d�j� plac�*/
        for (int i = 0; i < coordDepart.length; i++) {
            Bateau bAPlacer2 = new Bateau(coordDepart[i], coordArrive[i], i+1, zoneJeu);
            
            if (bAPlacer2.collision(bateauPlace) != resultatAttendu[i]) {
                nbEchecs++;
                System.out.println("Erreur test " + i);
            }
        }
        System.out.println("Nombre d'echecs de Collision : " + nbEchecs);

    }
    
    
    /**
     * Test unitaire de la m�thode AjouterCoordonnee
     */
    public static void testAjouterCoordonnee() {
        
        System.out.println("*** Test ajouterCoordonnee ***");
        for (int i = 0; i < coordDepart.length; i++) {
            Zone zoneDeCoordonnees = new Zone(coordDepart[i], coordArrive[i]); 
            zoneDeCoordonnees.ajouterCoordonnee();
            System.out.println(zoneDeCoordonnees.getZoneCoord().toString());
        }
        
    }
    
    /**
     * Test unitaire de la m�thode AjouterCoordonnee(Bateau)
     */
    public static void testAjouterCoordonneeBateau() {
        Zone zoneOuAjouter = new Zone();
        
        System.out.println("*** Test ajouterCoordonnee(Bateau) ***");
        for (int i = 0; i < coordDepart.length; i++) {
            Bateau aAjouter = new Bateau(coordDepart[i], coordArrive[i], i, zoneJeu); 
            zoneOuAjouter.ajouterCoordonnee(aAjouter);
            System.out.println(zoneOuAjouter.getZoneCoord().toString());
        }
        
    }
    
    /**
     * Test unitaire de la m�thode TrierCoolectionCoord
     */
    public static void testTrierCollectionCoord() {
        ArrayList<Coordonnee> ajoutCoordonnee = new ArrayList<Coordonnee>();

        System.out.println("*** Test trierCollectionCoord");
        for (int i = 0; i < coordDepart.length; i++) {
            ajoutCoordonnee.add(coordDepart[i]);
            ajoutCoordonnee.add(coordArrive[i]);
        }
        Zone.trierCollecCoord(ajoutCoordonnee);
        System.out.println(ajoutCoordonnee.toString());
    }
    
    /**
     * Test unitaire de la m�thode AjouterZone
     */
    public static void testAjouterZone() {
        Zone zoneOuAjouter = new Zone();
        
        System.out.println("*** Test ajouterZone ***");
        for (int i = 0; i < coordDepart.length; i++) {
            Zone aAjouter = new Zone(coordDepart[i], coordArrive[i]);
            zoneOuAjouter.ajouterZone(aAjouter);
        }
        System.out.println(zoneOuAjouter.getZoneContenu().toString());
    }
    
    /**
     * Test unitaire de la m�thode AjouterFlotte
     */
    public static void testAjouterFlotte() {
        Zone zoneOuAjouter = new Zone();
        
        Flotte maFlotte = new Flotte();
        
        System.out.println("*** Test ajouterFlotte ***");
        for (int i = 0; i < coordDepart.length; i++) {
            Bateau aAjouter = new Bateau(coordDepart[i], coordArrive[i], i, zoneJeu);
            maFlotte.ajouterBateau(aAjouter);
        }
        zoneOuAjouter.ajouterFlotte(maFlotte);
        System.out.println(zoneOuAjouter.getZoneContenu().toString());
    }
    

    
    /**
     * Lancement des tests
     * @param args
     */
    public static void main(String[] args) {
        //testCreationZone();
        //testHorsZone(zoneJeu);
        //zoneJeu.afficherZone();
        //testAjouterCoordonnee();
        //testGetZoneCoord();
        testCollision();
        testAjouterZone();
        testAjouterFlotte();
        testAjouterCoordonnee();
        testAjouterCoordonneeBateau();
        testTrierCollectionCoord();
    }

}
