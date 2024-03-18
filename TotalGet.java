package MathProblems;

public class TotalGet {

	public void Get(int totalMarks,int practicalMarks,int maxTotal) {
		int getM= (totalMarks+practicalMarks)*100;
		
		int maxtotal1=maxTotal;
		int percentage= getM/maxTotal;
		System.out.println(percentage);
	}
}
