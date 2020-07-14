package Calculadora;
import java.util.Stack;

public class evaluacion {
   public static String Postfijo2resulTxt(String postfijo){//<- Entra la expresion postfija con espacios
     String expr = postfijo;  //<- expr va a contener lo que tenia postfijo
     String[] post = expr.split(" ");  //<- El metodo split dividirá por cada espacio y almacenará cada division en un array  
    
     //Declaración de las pilas
     Stack < String > E = new Stack < String > (); //<-Pila entrada
     Stack < String > P = new Stack < String > (); //<-Pila de operandos
    

     for (int i=post.length-1; i>=0;i--) {//<- Añadiendo post (array) a la Pila de entrada (E)
        E.push(post[i]);
      }
  
     //Algoritmo de Evaluación Postfija
     String operadores = "+-*/^"; //<- declarar varibale con los operadores
      while (!E.isEmpty()) {//<- mientras que E contenga algo
          if (operadores.contains("" + E.peek())) { //<- La pila E solo contdrá operadores, la pila S operandos
            P.push(evaluar(E.pop(), P.pop(), P.pop()) + "");//<-Apilar en P la operacion (Operador, num1, num2)
          }else {
            P.push(E.pop());//<- Apilar en P lo desapilado en E
          } 
       }
      
     String resultado = P.peek(); //<- Igualacion en una variable el resultado encontrado en el ultimo nivel de P, P.peek() para que pueda ser retornada   
   return resultado;
 }

  private static float evaluar(String op, String n2, String n1) {
    float num1 = Float.parseFloat(n1);
    float num2 = Float.parseFloat(n2);

    if (op.equals("+")){       
        return (num1 + num2);                             
    }
    if (op.equals("-")){
        return (num1 - num2);
    }
    if (op.equals("*")){
        return (num1 * num2);
    }
    if (op.equals("/")){
        return (num1 / num2);
    }
    if (op.equals("^")){
        float pot;
        pot = (float) Math.pow(num1,num2);      
        return (pot);
    }   
    return 0;  
  }
  
}