package appsCommon;

import AnalysisTools.CEDCD.Pages.CEDCDAdminPage;
import AnalysisTools.CEDCD.Pages.CEDCDBiospecimenCountsPage;
import AnalysisTools.CEDCD.Pages.CEDCDCohortPage;
import AnalysisTools.CEDCD.Pages.CEDCDSearchCohortsPage;
import AnalysisTools.CEDCD.StepsImplementation.CEDCDAlphabetizedSelectTypesStepImp;
import AnalysisTools.CEDCD.StepsImplementation.CEDCDBiospecimenCountsAlphabeticalCancerTypeStepImp;
import AnalysisTools.CEDCD.StepsImplementation.CEDCDSearchCohortNewPageLayOutStepImp;
import AnalysisTools.CEDCD.StepsImplementation.CEDCDSearchCohortsCategoriesOfDataOfDataSortedStepImp;
import AnalysisTools.CEDCD.StepsImplementation.CEDCDSearchFemaleCohortsStepImp;
import AnalysisTools.CEDCD.StepsImplementation.CEDCDSelectAllCohortsStepImp;
import AnalysisTools.ICRP.Pages.ICRPHomePage;
import AnalysisTools.ICRP.Pages.ICRPSearchDatabase;
import AnalysisTools.JPSurv.Pages.JPSurvHomePage;
import AnalysisTools.Comets2.Pages.Comets2Page;
import AnalysisTools.CEDCD.Steps.CEDCDStartUps;
import AnalysisTools.LDLink.Pages.LDLinkHomePage;
import AnalysisTools.LDLink.Pages.LDLinkLandingPage;
import AnalysisTools.PLCO.Pages.BrowsePhenotypePage;
import AnalysisTools.PLCO.Pages.ExploreGWASPage;
import AnalysisTools.PLCO.Pages.InformationPage;
import AnalysisTools.mSigPortal.Pages.CatalogPages;
import AnalysisTools.mSigPortal.Pages.MSigPortalHomePage;
import AnalysisTools.mSigPortal.Pages.SignatureExplorerPages;
import AnalysisTools.mSigPortal.Pages.SignatureVisualizationsPage;
import AnalysisTools.mSigPortal.Steps.SignatureVisualizationSteps;
import ServiceNow.CHARMS.NativeView.Pages.CHARMSNativeViewPage;
import ServiceNow.CHARMS.Pages.CGBIIQPage;
import ServiceNow.CHARMS.Pages.CGBIIQPages;
import ServiceNow.CHARMS.Pages.CHARMSHomePage;
import ServiceNow.CHARMS.Pages.ClinicalGeneticsBranchPage;
import ServiceNow.CHARMS.Pages.MelanomaHomePage;
import ServiceNow.CHARMS.Pages.MelanomaLoginPage;
import ServiceNow.CHARMS.Pages.MelanomaQuestionnairePage;
import ServiceNow.CHARMS.Pages.MyRASHomePage;
import ServiceNow.CHARMS.Pages.MyRASLoginPage;
import ServiceNow.CHARMS.Pages.MyRASStudyConsentPage;
import ServiceNow.CHARMS.Pages.OKTAloginPage;
import ServiceNow.CHARMS.Pages.ProbandScreenerPage;
import ServiceNow.CHARMS.Pages.RASSurveyPage;
import ServiceNow.CHARMS.Pages.RASopathyQuestionnairePage;
import ServiceNow.CHARMS.Pages.TestAccountResetPage;
import ServiceNow.CHARMS.StepsImplementation.CHARMSHomePageImp;
import ServiceNow.CHARMS.StepsImplementation.RASSurveyStepsImpl;
import ServiceNow.CHARMS.StepsImplementation.TestAccountResetImpl;
import ServiceNow.CICDBuild.Pages.DevOpsLoginPage;
import ServiceNow.CICDBuild.Pages.DevOpsNativeViewPage;
import ServiceNow.CICDBuild.StepsImplementation.DevOpsAutomatedBuildStepsImplementation;
import ServiceNow.COVIDCode.Pages.COVIDCodeLoginPage;
import ServiceNow.COVIDCode.Pages.EnrollmentQuestionnairePage;
import ServiceNow.COVIDCode.Pages.FollowUpFormPage;
import ServiceNow.COVIDCode.Pages.NativeViewEnrollmentViewPage;
import ServiceNow.COVIDCode.Pages.NativeViewEnrollmentsPage;
import ServiceNow.COVIDCode.Pages.ServicePortalQuestionnairePage;
import ServiceNow.COVIDCode.Pages.ServicePortalSurveyPage;
import ServiceNow.COVIDCode.StepsImplementation.COVIDCodeLoginStepsImpl;
import ServiceNow.COVIDCode.StepsImplementation.DashboardStepImpl;
import ServiceNow.COVIDCode.StepsImplementation.FollowUpFormPageImpl;
import ServiceNow.COVIDCode.StepsImplementation.NativeViewStepsImpl;
import ServiceNow.COVIDCode.StepsImplementation.ServicePortalEQPageImpl;
import ServiceNow.COVIDCode.StepsImplementation.ServicePortalQuestionnairePageImp;
import ServiceNow.COVIDCode.StepsImplementation.SignOutVerificationStepImp;
import ServiceNow.COVIDDash.NativeView.Pages.NativeViewDashboardPage;
import ServiceNow.COVIDDash.Pages.COVIDHomePage;
import ServiceNow.COVIDDash.Pages.SubmissionsPage;
import ServiceNow.COVIDDash.StepsImplementation.COVIDHomePageImpl;
import ServiceNow.NERD.Pages.CreateNewSubmissionPage;
import ServiceNow.NERD.Pages.NERDCRSTCollaborationsPage;
import ServiceNow.NERD.Pages.NERDCRSTopAccomplishmentsPage;
import ServiceNow.NERD.Pages.NERDDOCCollaborationsPage;
import ServiceNow.NERD.Pages.NERDDynamicXPATHS;
import ServiceNow.NERD.Pages.NERDHomePage;
import ServiceNow.NERD.Pages.NERDKnowledgebasePage;
import ServiceNow.NERD.Pages.NERDSubmissionsPage;
import ServiceNow.NERD.StepsImplementation.NERDLoginStepsImplementation;
import ServiceNow.NERD.StepsImplementation.NativeViewImpersonateUser;
import ServiceNow.SEER.Pages.NativeViewSentViewPage;
import ServiceNow.SEER.Pages.SEERDataAccessRequestPage;
import ServiceNow.SEER.Pages.SEERIncidenceDatabaseDetailsPage;
import ServiceNow.SEER.Pages.SEERLandingPage;
import ServiceNow.SEER.Pages.SEERUserRegistrationPage;

/**
 * This an initializer class which will initialize all pages classes. Once pages
 * class created, create an object of it here inside the constructor
 */
public class PageInitializer {

	// declare protected static variables of types of all the pages
	/** iTrust instances */
	protected static ITrustLoginPage iTrustloginPage;
	protected static ITrustLoginPageImpl loginImpl;

	/** COVID19 Dashboard instances */
	protected static COVIDHomePage covidHomePage;
	protected static SubmissionsPage submissionPage;
	protected static NativeViewDashboardPage nativeViewDashPage;
	protected static COVIDHomePageImpl covidHomePageImpl;

	/** COVIDcode instances */
	protected static COVIDCodeLoginPage covidCodeLoginPage;
	protected static EnrollmentQuestionnairePage covidCodeEQPage;
	protected static ServicePortalEQPageImpl covidCodeEQPageImpl;
	protected static NativeViewEnrollmentsPage nativeViewEnrollementsPage;
	protected static NativeViewEnrollmentViewPage nativeViewEnrollmentViewPage;
	protected static NativeViewStepsImpl nativeViewStepsImpl;
	protected static FollowUpFormPage followUpFormPage;
	protected static FollowUpFormPageImpl followUpFormPageImpl;
	protected static COVIDCodeLoginStepsImpl covidCodeLoginStepsImpl;
	protected static ServicePortalSurveyPage servicePortalSurveyPage;
	protected static SignOutVerificationStepImp signOutVerificationStepImp;
	protected static ServicePortalQuestionnairePage servicePortalQuestionnairePage;
	protected static ServicePortalQuestionnairePageImp servicePortalQuestionnairePageImp;
	protected static DashboardStepImpl dashboardStepImpl;

	/** Native View instance */
	protected static NativeViewLoginImpl nativeViewLoginImpl;
	protected static NativeViewHomePage nativeViewHomePage;
	protected static NativeViewImpersonateUser nativeViewImpersonateUser;

	/** CHARMS instances */
	protected static CHARMSNativeViewPage charmsNativeViewPage;
	protected static TestAccountResetImpl testAccountResetImpl;
	protected static CHARMSHomePage charmsHomePage;
	protected static OKTAloginPage oktaLoginPage;
	protected static CHARMSHomePageImp charmsHomePageImpl;
	protected static ClinicalGeneticsBranchPage clinicalGeneticsBranchPage;
	protected static ProbandScreenerPage probandScreenerPage;
	protected static MyRASLoginPage myRASLoginPage;
	protected static MyRASHomePage myRASHomePage;
	protected static RASopathyQuestionnairePage rasopathyQuestionnairePage;
	protected static TestAccountResetPage testAccountResetPage;
	protected static MyRASStudyConsentPage myRasStudyConsentPage;
	protected static CGBIIQPage cgbIIQPage;
	protected static CGBIIQPages cGBIIQPages;
	protected static RASSurveyPage rASSurveyPage;
	protected static RASSurveyStepsImpl rASSurveyStepsImpl;

	/** LDLink instances **/
	protected static LDLinkHomePage ldLinkHomePage;
	protected static LDLinkLandingPage ldLinkLandingPage;

	/** PLCO instances **/
	protected static ExploreGWASPage exploreGWASPage;
	protected static BrowsePhenotypePage browsePhenotypePage;
	protected static InformationPage informationPage;

	/** ServiceNow DevOps instances */
	protected static DevOpsLoginPage devOpsLoginPage;
	protected static DevOpsNativeViewPage devOpsNativeViewPage;
	protected static DevOpsAutomatedBuildStepsImplementation devOpsAutomatedBuildStepsImplementation;

	/** CEDCD instances */
	protected static CEDCDCohortPage cedcdCohortPage;
	protected static CEDCDSearchCohortsPage cedcdSearchCohortsPage;
	protected static CEDCDAdminPage cedcdAdminPage;
	protected static CEDCDSearchFemaleCohortsStepImp cedcdSearchFemaleCohortsStepImp;
	protected static CEDCDSelectAllCohortsStepImp cedcdSelectAllCohortsStepImp;
	protected static CEDCDBiospecimenCountsPage cedcdBiospecimenCountsPage;
	protected static CEDCDSearchCohortNewPageLayOutStepImp cedcdSearchCohortNewPageLayOutStepImp;
	protected static CEDCDAlphabetizedSelectTypesStepImp cedcdAlphabetizedSelectTypesStepImp;
	protected static CEDCDStartUps cedcdStartUps;
	protected static CEDCDSearchCohortsCategoriesOfDataOfDataSortedStepImp cedcdSearchCohortsCategoriesOfDataOfDataSortedStepImp;
	protected static CEDCDBiospecimenCountsAlphabeticalCancerTypeStepImp cedcdBiospecimenCountsAlphabeticalCancerTypeStepImp;

	/** SEER instances */
	protected static SEERLandingPage seerLandingPage;
	protected static SEERUserRegistrationPage seerUserRegistrationPage;
	protected static SEERDataAccessRequestPage seerDataAccessRequestPage;
	protected static NativeViewSentViewPage nativeViewSentViewPage;
	protected static SEERIncidenceDatabaseDetailsPage seerIncidenceDatabaseDetailsPage;

	/** NERD instances */
	protected static NERDLoginStepsImplementation nerdLoginStepsImplementation;
	protected static NERDSubmissionsPage nerdCrsKnowledgeDatabaseSubmissionsPage;
	protected static CreateNewSubmissionPage createNewSubmissionPage;
	protected static NERDDynamicXPATHS nerdDynamicXpaths;
	protected static NERDHomePage nerdHomePage;
	protected static NERDKnowledgebasePage nerdKnowledgeBasePage;
	protected static NERDCRSTopAccomplishmentsPage nerdCRSTopAccomplishmentsPage;
	protected static NERDCRSTCollaborationsPage nerdCRSTCollaborationsPage; 
	protected static NERDDOCCollaborationsPage nerdDOCCollaborationsPage;

	/** Comets 2.0 Instances */
	protected static Comets2Page comets2Page;

	/** mSigPortal Instances */
	protected static SignatureVisualizationsPage signatureVisualizationsPage;
	protected static MSigPortalHomePage mSigPortalHomePage;
	protected static SignatureExplorerPages signatureExplorerPages;
	protected static CatalogPages catalogPages;

	/** ICRP instances **/
	protected static ICRPHomePage icrpHomePage;
	protected static ICRPSearchDatabase icrpSearchDatabase;

	/** JPSurv instances **/
	protected static JPSurvHomePage jpsurvHomePage;

	/** Melanoma and Spitzoid Tumor instances **/
	protected static MelanomaLoginPage melanomaLoginPage;
	protected static MelanomaHomePage melanomaHomePage;
	protected static MelanomaQuestionnairePage melanomaQuestionnairePage;

	public static void initializeAllPages() {
		// create instances of all pages and assign them to the variables
		iTrustloginPage = new ITrustLoginPage();
		loginImpl = new ITrustLoginPageImpl();
		covidHomePage = new COVIDHomePage();
		submissionPage = new SubmissionsPage();
		nativeViewDashPage = new NativeViewDashboardPage();
		covidHomePageImpl = new COVIDHomePageImpl();
		covidCodeEQPage = new EnrollmentQuestionnairePage();
		covidCodeEQPageImpl = new ServicePortalEQPageImpl();
		covidCodeLoginPage = new COVIDCodeLoginPage();
		nativeViewEnrollementsPage = new NativeViewEnrollmentsPage();
		nativeViewEnrollmentViewPage = new NativeViewEnrollmentViewPage();
		followUpFormPage = new FollowUpFormPage();
		followUpFormPageImpl = new FollowUpFormPageImpl();
		covidCodeLoginStepsImpl = new COVIDCodeLoginStepsImpl();
		nativeViewLoginImpl = new NativeViewLoginImpl();
		nativeViewHomePage = new NativeViewHomePage();
		charmsNativeViewPage = new CHARMSNativeViewPage();
		testAccountResetImpl = new TestAccountResetImpl();
		servicePortalSurveyPage = new ServicePortalSurveyPage();
		ldLinkLandingPage = new LDLinkLandingPage();
		ldLinkHomePage = new LDLinkHomePage();
		exploreGWASPage = new ExploreGWASPage();
		charmsHomePage = new CHARMSHomePage();
		oktaLoginPage = new OKTAloginPage();
		charmsHomePageImpl = new CHARMSHomePageImp();
		clinicalGeneticsBranchPage = new ClinicalGeneticsBranchPage();
		probandScreenerPage = new ProbandScreenerPage();
		devOpsLoginPage = new DevOpsLoginPage();
		devOpsNativeViewPage = new DevOpsNativeViewPage();
		devOpsAutomatedBuildStepsImplementation = new DevOpsAutomatedBuildStepsImplementation();
		signOutVerificationStepImp = new SignOutVerificationStepImp();
		cedcdSearchCohortsPage = new CEDCDSearchCohortsPage();
		cedcdSearchFemaleCohortsStepImp = new CEDCDSearchFemaleCohortsStepImp();
		cedcdSelectAllCohortsStepImp = new CEDCDSelectAllCohortsStepImp();
		cedcdBiospecimenCountsPage = new CEDCDBiospecimenCountsPage();
		cedcdSearchCohortNewPageLayOutStepImp = new CEDCDSearchCohortNewPageLayOutStepImp();
		cedcdAlphabetizedSelectTypesStepImp = new CEDCDAlphabetizedSelectTypesStepImp();
		cedcdStartUps = new CEDCDStartUps();
		cedcdSearchCohortsCategoriesOfDataOfDataSortedStepImp = new CEDCDSearchCohortsCategoriesOfDataOfDataSortedStepImp();
		cedcdBiospecimenCountsAlphabeticalCancerTypeStepImp = new CEDCDBiospecimenCountsAlphabeticalCancerTypeStepImp();
		servicePortalQuestionnairePage = new ServicePortalQuestionnairePage();
		servicePortalQuestionnairePageImp = new ServicePortalQuestionnairePageImp();
		dashboardStepImpl = new DashboardStepImpl();
		nativeViewStepsImpl = new NativeViewStepsImpl();
		seerLandingPage = new SEERLandingPage();
		seerUserRegistrationPage = new SEERUserRegistrationPage();
		seerDataAccessRequestPage = new SEERDataAccessRequestPage();
		nativeViewSentViewPage = new NativeViewSentViewPage();
		seerIncidenceDatabaseDetailsPage = new SEERIncidenceDatabaseDetailsPage();
		nerdLoginStepsImplementation = new NERDLoginStepsImplementation();
		nerdCrsKnowledgeDatabaseSubmissionsPage = new NERDSubmissionsPage();
		createNewSubmissionPage = new CreateNewSubmissionPage();
		nativeViewImpersonateUser = new NativeViewImpersonateUser();
		nerdDynamicXpaths = new NERDDynamicXPATHS();
		browsePhenotypePage = new BrowsePhenotypePage();
		informationPage = new InformationPage();
		cedcdAdminPage = new CEDCDAdminPage();
		cedcdCohortPage = new CEDCDCohortPage();
		icrpHomePage = new ICRPHomePage();
		icrpSearchDatabase = new ICRPSearchDatabase();
		comets2Page = new Comets2Page();
		signatureVisualizationsPage = new SignatureVisualizationsPage();
		mSigPortalHomePage = new MSigPortalHomePage();
		signatureExplorerPages = new SignatureExplorerPages();
		catalogPages = new CatalogPages();
		myRASLoginPage = new MyRASLoginPage();
		myRASHomePage = new MyRASHomePage();
		rasopathyQuestionnairePage = new RASopathyQuestionnairePage();
		testAccountResetPage = new TestAccountResetPage();
		myRasStudyConsentPage = new MyRASStudyConsentPage();
		cgbIIQPage = new CGBIIQPage();
		cGBIIQPages = new CGBIIQPages();
		rASSurveyPage = new RASSurveyPage();
		rASSurveyStepsImpl = new RASSurveyStepsImpl();
		jpsurvHomePage = new JPSurvHomePage();
		melanomaLoginPage = new MelanomaLoginPage();
		melanomaHomePage = new MelanomaHomePage();
		melanomaQuestionnairePage = new MelanomaQuestionnairePage();
		nerdHomePage = new NERDHomePage();
		nerdKnowledgeBasePage = new NERDKnowledgebasePage();
		nerdCRSTopAccomplishmentsPage = new NERDCRSTopAccomplishmentsPage();
		nerdDOCCollaborationsPage = new NERDDOCCollaborationsPage();
	}
}
