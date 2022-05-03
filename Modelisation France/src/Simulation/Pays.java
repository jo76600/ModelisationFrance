/**
 * 
 */
package Simulation;

/**
 * @author bayle
 *
 */
public class Pays {

	
	// Définition des variables : 
	private int superficie;
	private int population;
	private int entreePopulation; 
	private int sortiePopulation; 
	private int importGlobaux;
	private int ExportGlobaux;
	private int Naissance;
	private int Deces;
	private int Solde;
	private float Chomage;
	private float BudgetCulture; 
	private float BudgetJustice; 
	private float BudgetEducation;
	private float BudgetSante;
	private int NbreEtudiants;
	private int NbreCollegiens;
	private int NbreLyceens;
	private int NbrePrimaires;
	
	// Définition des fonctions associées 
	
	public void DefinitionSuperficie(int Definition_superficie) {
		superficie=Definition_superficie;
	}	
	public void AffichageSuperficie() {
		System.out.println("Superficie du pays : " + superficie);
	}
	public void DefinitionPopulation(int Definition_population) {
		population=Definition_population;
	}
	public void AffichagePopulation() {
		System.out.println("Population de la pays : " + population);
	}
	public void DefinitionImportation(int Importation) {
		importGlobaux=Importation;
	}
	public void AffichageImportation() {
		System.out.println("Importation du pays : " + importGlobaux);
	}
	public void DefinitionExportation(int Exportation) {
		ExportGlobaux=Exportation;
	}
	public void AffichageExportation() {
		System.out.println("Exportation de la France :" + ExportGlobaux);
	}
	public void DefinitionEntreePopulation(int EntreePopulation) {
		entreePopulation=EntreePopulation;
	}
	public void AffichageEntreePopulation() {
		System.out.println("Population entrantes " + entreePopulation );
	}
	public void DefinitionSortiePopulation(int SortiePopulation)
	{
		sortiePopulation=SortiePopulation;
	}
	public void AffichageSortiePopulation() {
		System.out.println("Population sortante : " + sortiePopulation);
	}
	public void DefinitionNaissance(int NbNaissances) {
		Naissance=NbNaissances;
	}
	public void AffichageNaissance() {
		System.out.println("Nombre de naissances : " + Naissance);
	}
	public void DefinitionDeces(int NbDeces) {
		Deces=NbDeces;
	}
	public void AffichageDeces() {
		System.out.println("Nombre de décès : " + Deces);
	}
	public void DefinitionSolde(int DefSolde) {
		Solde=DefSolde;
	}
	public void AffichageSolde() {
		System.out.println("Le solde économique est le suivant : " + Solde);
	}
	public void DefinitionChomage(float DefChomage) {
		Chomage=DefChomage;
	}
	public void AffichageChomage() {
		System.out.println("Le taux de chômage est le suivant : " + Chomage);
	}
	public void DefinitionBudgetCulture(float DefBudgetCulture) {
		BudgetCulture=DefBudgetCulture;
	}
	public void AffichageBudgetCulture() {
		System.out.println("Le budget de la culture est de : " + BudgetCulture);
	}
	public void DefinitionBudgetJustice(float DefBudgetJustice) {
		BudgetJustice=DefBudgetJustice;
	}
	public void AffichageBudgetJustice() {
		System.out.println("Le budget de la justice est le suivant : " + BudgetJustice);
	}
	public void DefinitionBudgetEducation(float DefBudgetEducation) {
		BudgetEducation=DefBudgetEducation;
	}
	public void AffichageBudgetEducation() {
		System.out.println("Le budget de l'éducation est le suivant : " + BudgetEducation);
	}
	public void DefinitionBudgetSante(float DefBudgetSante) {
		BudgetSante=DefBudgetSante;
	}
	public void AffichageBudgetSante() {
		System.out.println("Le budget de la santé est le suivant : " + BudgetSante);
	}
	public void DefinitionNbreCollegiens(int DefNbreCollegiens) {
		NbreCollegiens=DefNbreCollegiens;
	}
	public void AffichageNbreCollegiens() {
		System.out.println("Nombre de collégiens : " + NbreCollegiens);
	}
	public void DefinitionNbreLyceens(int DefNbreLyceens) {
		NbreLyceens=DefNbreLyceens;
	}
	public void AffichageNbreLyceens() {
		System.out.println("Nombre de lycéens : " + NbreLyceens);
	}
	public void DefinitionNbreEtudiants(int DefNbreEtudiants) {
		NbreEtudiants=DefNbreEtudiants;
	}
	public void AffichageNbreEtudiants() {
		System.out.println("Nombre d'étudiants : " + NbreEtudiants);
	}
	public void DefinitionNbrePrimaires(int DefNbrePrimaires) {
		NbrePrimaires=DefNbrePrimaires;
	}
	public void AffichageNbrePrimmaires() {
		System.out.println("Nombre de primaires: " + NbrePrimaires);
	}
	o

}
