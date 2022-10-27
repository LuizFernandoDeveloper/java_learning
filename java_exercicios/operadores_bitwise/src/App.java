/*
 * Operadores bitwise, são usados para fazer operação de bit a bit em valores;
 * 
 *  ________________________________________________________
 *  |--------|----------------------------------| Descrição
 *  |Operador|           Significado            |
 *  |--------|----------------------------------|
 *  |    &   |      Operação "E" bit a bit      |
 *  |--------|----------------------------------|
 *  |    |   |      Operação "OU" bit a bit     |
 *  |--------|----------------------------------|
 *  |    ^   |Operação "OU-exclusivo" bit a bit |
 *  |--------|----------------------------------|
 *  
 *  Tabela verdade do operadores bitwise
 *  
 *  _____________________________________________________
 *  |----|----|---------| TABELA VERDADE COM OPERADOR 'E'
 *  | C1 | C2 | C1 E C2 |
 *  |----|----|---------|
 *  | F  |  F |    F    |
 *  |----|----|---------|
 *  | F  | V  |    F    |
 *  |----|----|---------|
 *  | V  | F  |    F    |
 *  |----|----|---------|
 *  | V  |  V |    V    |
 *  |----|----|---------|
 *  _______________________________________________________
 *  |----|----|----------| TABELA VERDADE COM OPERADOR 'OU'
 *  | C1 | C2 | C1 OU C2 |
 *  |----|----|----------|
 *  | F  |  F |     F    |
 *  |----|----|----------|
 *  | F  | V  |     V    |
 *  |----|----|----------|
 *  | V  | F  |     V    |
 *  |----|----|----------|
 *  | V  |  V |     V    |
 *  |----|----|----------|
 *  _________________________________________________________ 
 *  |----|----|-----------| TABELA VERDADE COM OPERADOR 'XOR'
 *  | C1 | C2 | C1 XOU C2 |
 *  |----|----|-----------|
 *  | F  |  F |     F     |
 *  |----|----|-----------|
 *  | F  | V  |     V     |
 *  |----|----|-----------|
 *  | V  | F  |     V     |
 *  |----|----|-----------|
 *  | V  |  V |     F     |
 *  |----|----|-----------|
 * 
 *      DEMO
 *                   ___
 *     (89) 0101 1001   |    &: 0001 1000 (24)
 *                      |--> |: 0111 1101 (125)
 *     (60) 0011 1100___|    ^: 0110 0101 (101)
 * 
 *     Exemplo um:
 *     
 *     Nessa operação "E" ou "&" vamos comparar bit a bit , para uma melhor explicação vamos 
 *     comparar da direita para esquerda.
 *     
 *     Os bits dentro do quadrado, vão ser os que passarão pelo operador &. No operador
 *     se umas das entradas for falso ou 0 a saida também sera zero. Então logo o resultado
 *     sera zero.
 *                      ___
 *     (89) 0101 100|1|    |      resultado   
 *                  |-|    |--> &: 0
 *     (60) 0011 110|0| ___| 
 * 
 *                      ___
 *     (89) 0101 10|0|1    |      resultado   
 *                 |-|     |--> &: 00
 *     (60) 0011 11|0|0 ___|       
 * 
 * *                    ___
 *     (89) 0101 1|0|01    |      resultado   
 *                |-|      |--> &: 000
 *     (60) 0011 1|1|00 ___|              
 * 
 *                      ___
 *     (89) 0101 |1|001    |      resultado   
 *               |-|       |--> &: 0001 
 *     (60) 0011 |1|100 ___|   
 * 
 *                     ___
 *     (89) 010|1| 1001    |      resultado   
 *             |-|         |--> &: 0001 1
 *     (60) 001|1| 1100 ___| 
 * 
 *                      ___
 *     (89) 01|0|1 1001    |      resultado   
 *            |-|          |--> &: 0001 10
 *     (60) 00|1|1 1100 ___|    
 *                      ___
 *     (89) 0|1|01 1001    |      resultado   
 *           |-|           |--> &: 0001 100
 *     (60) 0|0|11 1100 ___| 
 * 
 *                      ___
 *     (89) |0|101 1001    |      resultado   
 *          |-|            |--> &: 0001 1000
 *     (60) |0|011 1100 ___|                                                      
 *                   
 *     Resultado final
 *                   ___
 *     (89) 0101 1001   |      resultado da operação bitwise &
 *                      |--> &: 0001 1000 (24)
 *     (60) 0011 1100___|        
 */                     






public class App {
    public static void main(String[] args) throws Exception {
        
        int numberOne = 89;
        int numberTwo = 60;

        System.out.println(numberOne & numberTwo);
        System.out.println(numberOne | numberTwo);
        System.out.println(numberOne ^ numberTwo);

    }
}
