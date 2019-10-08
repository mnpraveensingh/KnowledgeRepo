package enumTest;

public class EnumTest {
	public enum AuditApplicabilities{
		GDPR_DPIA("GDPR DPIA"),
		ISO_27K("ISO 27K"),
		GDPR("GDPR"),
		ISO_20K("ISO 20K"),
		CMMi_Dev("CMMi - Dev"),
		CMMi_Maintenance("CMMi - Maintenance"),
		IMTS_Audit("IMTS Audit"),
		Microsoft_SSPA("Microsoft SSPA");
		
		private final String applicabilityName;
		AuditApplicabilities(String applicabilityName){
			this.applicabilityName=applicabilityName;
		}
		
		public String getSubscriptionid(){
			return applicabilityName;
		}
	}	
}
