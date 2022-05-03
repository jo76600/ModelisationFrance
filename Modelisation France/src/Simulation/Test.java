package Simulation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Pays France=new Pays();
		Region Normandie=new Region();
		Region Bretagne=new Region();
		Departement Seine_Maritime=new Departement();
		
		
		// Définition des pays : 
		
		France.DefinitionSuperficie(557000);
		France.DefinitionImportation(0);
		France.DefinitionExportation(0);
		France.DefinitionPopulation(0);
		France.DefinitionEntreePopulation(200000);
		France.DefinitionSortiePopulation(200000);
		
		
		France.AffichageSuperficie();
		France.AffichagePopulation();
		France.AffichageExportation();
		France.AffichageImportation();
		France.AffichageEntreePopulation();
		France.AffichageSortiePopulation();
		
		
		// Définition des régions :
		
		
		Normandie.DefinitionSuperficie(557000);
		Normandie.DefinitionImportation(0);
		Normandie.DefinitionExportation(0);
		Normandie.DefinitionPopulation(0);
		Normandie.DefinitionEntreePopulation(100000);
		Normandie.DefinitionSortiePopulation(200000);
		
		
		Normandie.AffichageSuperficie();
		Normandie.AffichagePopulation();
		Normandie.AffichageExportation();
		Normandie.AffichageImportation();
		Normandie.AffichageEntreePopulation();
		Normandie.AffichageSortiePopulation();
		
		
		Bretagne.DefinitionSuperficie(557000);
		Bretagne.DefinitionImportation(0);
		Bretagne.DefinitionExportation(0);
		Bretagne.DefinitionPopulation(0);
		Bretagne.DefinitionEntreePopulation(100000);
		Bretagne.DefinitionSortiePopulation(0);;
		
		
		Bretagne.AffichageSuperficie();
		Bretagne.AffichagePopulation();
		Bretagne.AffichageExportation();
		Bretagne.AffichageImportation();
		Bretagne.AffichageEntreePopulation();
		Bretagne.AffichageSortiePopulation();
		
		
		// Définition des départements : 
		
		Seine_Maritime.DefinitionSuperficie(557000);
		Seine_Maritime.DefinitionImportation(0);
		Seine_Maritime.DefinitionExportation(0);
		Seine_Maritime.DefinitionPopulation(0);
		Seine_Maritime.DefinitionEntreePopulation(200000);
		Seine_Maritime.DefinitionSortiePopulation(150000);
		

		Seine_Maritime.AffichageSuperficie();
		Seine_Maritime.AffichagePopulation();
		Seine_Maritime.AffichageExportation();
		Seine_Maritime.AffichageImportation();
		Seine_Maritime.AffichageEntreePopulation();
		Seine_Maritime.AffichageSortiePopulation();
		
		
	}
	

}
