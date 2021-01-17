package programms;

public class stingPractice {

	public static void main(String[] args) {
		String str="sunte hain mil jati h har cheez dua se";
		int count;
		char cha[] = str.toCharArray();
		
		for(int i =0; i<cha.length;i++)
		{
			count = 1;
			for (int j =i+1;j<cha.length;j++)
			{
				if (cha[i]==cha[j] && cha[i]!=' ' ) {
					count++;
				cha[j]='0';
				}
				if(count>1 && cha[i]!='0') {
					System.out.println(cha[i]);
				}
			}
		}
		

	}

}
