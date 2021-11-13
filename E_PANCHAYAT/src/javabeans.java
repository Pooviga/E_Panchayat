import java.text.SimpleDateFormat;

public class javabeans {

	private String district = "";
	private String town_panchyat = "";
	private String number = "";
	private String email = "";
	private String date = "";
	private String gender = "";
	private String name = "";
	private String identification = "";
	private String father_name = "";
	private String Mother_name = "";
	private String age_father = "";
	private String age_mother = "";
	private String father_occupation = "";
	private String mother_occupation = "";
	private String child_weight = "";
	private String method_of_delivery = "";
	private String relegion = "";
	private String per_address = "";
	private String pincode = "";
	private String state = "";
	
	//death details
	private String hus_or_father_name = "";
	private String cause_of_death = "";
	private String certified = "";
	private String place_of_death = "";
	
	//water connection
	private String doorno = "";
	private String wardno = "";
	private String street_name  = "";
	private String connection_type = "";
	
	public String getDistrict() {
		return district;
	}
	
	public void setDistrict(String district) {
		if(district.matches("[a-zA-Z]+"))
		{
			this.district = district;
		}
	}

	//============================================================================
	
	public String getTown_panchyat() {
		return town_panchyat;
	}
	
	public void setTown_panchyat(String town_panchyat) {
		if(town_panchyat.length() > 5)
		{
			this.town_panchyat = town_panchyat;
		}
	}
	
	//==============================================================================
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		if(number.length() == 10)
		{
			try {
				Double.parseDouble(number);
				this.number = number;
			}
			catch(Exception e) {}
		}
	}
	//==============================================================================
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		if(email.contains("@") && !email.isEmpty())
		{
			this.email = email;
		}
	}
	
	//============================================================================
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		boolean bool = false;
		if(!date.isEmpty()) {
			bool = true;
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        dateFormat.setLenient(false);
	        try {
	            dateFormat.parse(date.trim());
	        } catch (Exception pe) {
	            bool = false;
	        }
		}
		if(bool) {
			this.date = date;
		}	
	}
	
	//===========================================================================
	
	public void setGender(String gender) {
		if(!gender.isEmpty()) {
			this.gender = gender;
		}
	}
	
	public String getGender() {
		return gender;
	}
	
	//===========================================================================
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(!name.isEmpty() && name.length()<=30)
		{
			this.name = name;
		}
	}
	
	//===========================================================================
	
	public String getIdentification() {
		return identification;
	}
	
	public void setIdentification(String identification) {
		if(!identification.isEmpty()) {
			this.identification = identification;
		}
	}
	
	//============================================================================
	
	public String getFather_name() {
		return father_name;
	}
	
	
	public void setFather_name(String father_name) {
		if(!father_name.isEmpty())
		{
			this.father_name = father_name;
		}
	}
	//==========================================================================
	
	public String getMother_name() {
		return Mother_name;
	}
	
	public void setMother_name(String mother_name) {
		if(!mother_name.isEmpty())
		{
			this.Mother_name = mother_name;
		}
	}
	
	
	//============================================================================
	
	public void setAge_father(String age_father) {
		try {
			Integer.parseInt(age_father);
			this.age_father = age_father;
		}
		catch(Exception e) {
			
		}
	}
	
	public String getAge_father() {
		return age_father;
	}
	
	//============================================================================
	
		public void setAge_mother(String age_mother) {
			try {
				Integer.parseInt(age_mother);
				this.age_mother = age_mother;
			}
			catch(Exception e) {
				
			}
		}
		
		public String getAge_mother() {
			return age_mother;
		}
	
	//============================================================================
	
	public String getFather_occupation() {
		return father_occupation;
	}
	
	public void setFather_occupation(String father_occupation) {
		if(!father_occupation.isEmpty())
		{
			this.father_occupation = father_occupation;
		}
	}
	
	//============================================================================
	
	public String getMother_occupation() {
		return mother_occupation;
	}
	
	public void setMother_occupation(String mother_occupation) {
		if(!mother_occupation.isEmpty())
		{
			this.mother_occupation = mother_occupation;
		}
	}
	//===========================================================================
	
	public String getChild_weight() {
		return child_weight;
	}
	
	public void setChild_weight(String child_weight) {
			if(!child_weight.isEmpty()) {
				
				try {
					Integer.parseInt(child_weight);
					this.child_weight = child_weight;
					
				}
				catch(Exception e) {}
			}
	}
	
	//============================================================================
	
	public String getMethod_of_delivery() {
		return method_of_delivery;
	}
	
	public void setMethod_of_delivery(String method_of_delivery) {
		if(!method_of_delivery.equals("-- SELECT --"))
		{
			this.method_of_delivery = method_of_delivery;
		}
	}
	
	//===========================================================================
	
	public String getRelegion() {
		return relegion;
	}
	
	public void setRelegion(String relegion) {
		if(!relegion.isEmpty())
		{
			this.relegion = relegion;
		}
	}
	//================================================================================
	
	public String getPer_address() {
		return per_address;
	}
	
	public void setPer_address(String per_address) {
		if(per_address.length() < 100 && !per_address.isEmpty())
		{
			this.per_address = per_address;  
		}
	}
	
	//================================================================================
	
	public String getPincode() {
		return pincode;
	}
	
	public void setPincode(String pincode) {
		if(pincode.length() == 6)
		{
			try {
				Double.parseDouble(pincode);
				this.pincode = pincode;
			}
			catch(Exception e) {}
		}
	}
	
	//=============================================================================
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
			if(!state.isEmpty()) {
				this.state = state; 
			}
	}
	
	//===============================================================================
	
	public String getHus_or_father_name() {
		return hus_or_father_name;
	}
	
	public void setHus_or_father_name(String name) {
		if((!name.isEmpty() && name.length()<=30))
		{
			this.hus_or_father_name = name;
		}
	}
	
	//===========================================================================
	
	public String getCause_of_death() {
		return cause_of_death;
	}
	
	public void setCause_of_death(String cause_of_death) {
		if(!cause_of_death.isEmpty())
		{
			this.cause_of_death = cause_of_death;
		}
	}
	
	//==============================================================================
	
	public void setCertified(String certified) {
		if(!certified.equals("-- SELECT --")) {
			this.certified = certified;
		}
	}
	
	public String getCertified() {
		return certified;
	}
	
	//==============================================================================
	
	public String getPlace_of_death() {
		return place_of_death;
	}
	
	public void setPlace_of_death(String place_of_death) {
		if(!place_of_death.isEmpty())
		{
			this.place_of_death = place_of_death;
		}
	}
	
	//=============================================================================
	
	public String getDoorno() {
		return doorno;
	}
	
	public void setDoorno(String doorno) {
		if(!doorno.isEmpty())
		{
			try {
				Integer.parseInt(doorno);
				this.doorno= doorno;
			}
			catch(Exception e) {
				if(doorno.contains("/")) {
					int in = -1;
					for(int i=0;i<doorno.length();i++) {
						if(doorno.charAt(i) == '/') {
							in = i;
						}
						
					}
					
					try {
						Integer.parseInt(doorno.substring(0, in-1));
						try {
							Integer.parseInt(doorno.substring(in+1,doorno.length()-1));
							this.doorno= doorno;
						}
						catch(Exception e1) {}
					}
					catch(Exception e2) {}
					
				}
			}
			
		}
	}
	
	//==========================================================================
	
	public String getWardno() {
		return wardno;
	}
	
	public void setWardno(String wardno) {
		if(!wardno.isEmpty())
		{
			try {
				Integer.parseInt(wardno);
				this.wardno= wardno;
			}
			catch(Exception e) {}
		}
	}
	
	//=============================================================================
	
	public String getStreet_name() {
		return street_name;
	}
	
	public void setStreet_name(String street_name) {
		if(!street_name.isEmpty())
		{
			this.street_name = street_name;
		}
	}
	
	//============================================================================
	
	public String getConnection_type() {
		return connection_type;
	}
	
	public void setConnection_type(String connection_type) {
		if(!connection_type.equals("-- SELECT --"))
		{
			this.connection_type = connection_type;
		}
	}
	
	//=============================================================================
	
}
