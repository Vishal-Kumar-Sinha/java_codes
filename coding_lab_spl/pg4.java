import java.util.*;
public class pg4 {

	public static void main(String[] args) {
		char str[][]= {{'a', 'g', 's', 't', 'y'}, {'b', 'r', 'x', 'l', 'e'}, {'p', 'q', 'z', 'm', 'w'}};;
		char search='l';
		int row=str.length;
		int column=str[0].length;
		int flag=0,getx=0,gety=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if(str[i][j]==search) {
					getx=i;
					gety=j;
					flag=1;
					break;
				}
			}
		}
		if(flag==1) {
			for(int i=0;i<gety;i++)
				System.out.print(str[getx][i]+" ");
			for(int j=0;j<getx;j++)
				System.out.print(str[j][gety]+" ");
		}
		else System.out.println(search+" notfound...");
	}

}
