/*          Funçoes interessantes para String
 *   1) Formatar: toLowerCase(), toUpperCase(), trim()
 *   2) Recortar: substring(inicio), substring(inicio, fim)
 *   3) Substituir: Replace(char, char), Replace(string, string)
 *   4) Buscar: IndexOf, LastIndecOf
 *   5) separar a string em um array usando por exemplos espaços : string.Split("")
 *   
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        String original = "abcde FFGHDWA TYDAWWDA RRRWWDRF bc";
        String stringLowerCase = original.toLowerCase();
        String stringUpperCase = original.toUpperCase();
        String stringTrim = original.trim();
        String stringSubstringOne = original.substring(2);
        String stringSubstringTwo = original.substring(2, 9);
        String stringReplace = original.replace('a', 'b');
        String stringReplaceTwo = original.replace("abc", "aipaipara");
        int localDeBc = original.indexOf("bc");// busca a primeira  ocorrencia de bc dentro de original 
        int localdeBcTwo = original.lastIndexOf("bc");// busca a ultima ocorrencia de bc dentro de original 
        String[] arrayOriginal = original.split(" ");

        // printando
        System.out.println("Original string: -" + original + "-");
        System.out.println("Lower case string: -" + stringLowerCase + "-");
        System.out.println("Upper case string: -" + stringUpperCase + "-");
        System.out.println("Trim string: -" + stringTrim + "-");
        System.out.println("substring one  string: -" + stringSubstringOne + "-");
        System.out.println("substring two  string: -" + stringSubstringTwo + "-");
        System.out.println("trocand o caracter a pelo b = replace: -" + stringReplace + "-");
        System.out.println("trocando bc por aipaipara usando replace: -" + stringReplaceTwo + "-");
        System.out.println("local de orinal que ocorre a primeira aparição de bc: -" + localDeBc + "-");
        System.out.println("local de orinal que ocorre a ultima aparição de bc: -" + localdeBcTwo + "-");
        for (String string : arrayOriginal) {
            System.out.println("Usando o split como separador levando em conssideração os espaços, elementos do array:" + string);
        } 
    }
}
