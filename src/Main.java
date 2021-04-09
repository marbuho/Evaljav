
import clasesausar.Conversor;

class Main{
		public static void main(String args[]){
			if (args.length == 2){
					boolean flag_rom = (args[0].equals("-r") );
					boolean flag_rom_minus =  (args[0].equals("-ri") );
					if (flag_rom){
							System.out.print(Conversor.to_romano(Integer.valueOf(args[1])));
					}
					else if (flag_rom_minus){
							System.out.print(Conversor.to_romano(Integer.valueOf(args[1]), true));
				}
			}
			else {
					System.out.print("utilice el argumento -r seguido del numero, para obtener su rep romana en mayuscula.\n");
					System.out.print("utilice el argumento -ri seguido del numero romano para obtener version minuscula ");
			}
		}
}