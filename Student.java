
public  class Student {
 
	private int matrikelNummer;
	private String nachName;
	private String VorName;
	private Double note;
	
	public Student(int matrikelNummer,String nachName,String VorName, double Note) {
		
		this.matrikelNummer = matrikelNummer;
		this.nachName = nachName;
		this.VorName = VorName;
		this.note = Note;
	
	}
	
	public int getMatrikelNummer() {
		
		
		return matrikelNummer;
	}

	public String getNachName() {
		
		
		return nachName;
	}
	
	public String getVorName() {
		
		
		return VorName;
	}
	
	public double getNote() {
		
		
		return note;
	}
		
	@Override
	
	public String toString() {
		
		
		return +matrikelNummer + nachName + VorName + note + "\n" ;
		
		
	}



	

	/*public int  compareTo(Student o) {
		
		double noteDiff = Note - o.gibNote();
		if (noteDiff != 0) {
			
			return noteDiff; 
			
		}
		else if ((noteDiff==0)&& Nachname.equals(o.gibNachname())) {
			
			return Nachname.compareTo(o.gibNachname());
		}
		else {
			
			return Matrikelnummer.compareTo.(o.gibMatrikelnummer());
		} */
		
		
		
	}

	

