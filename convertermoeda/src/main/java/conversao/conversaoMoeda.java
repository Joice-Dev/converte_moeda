
package conversao;

import javax.swing.JOptionPane;


public class conversaoMoeda {
    public static void main (String[]args){
     String moeda;
     moeda = JOptionPane.showInputDialog("Por favor, escolha qual tipo de conversão você deseja:"
             + "\n1  *Euro"
             + "\n2  *Dólar"
             + "\n3  *Libra");
     
     
     int opcao;
     opcao = Integer.parseInt(moeda);
     
     if (opcao == 1){
     String valor;
     valor = JOptionPane.showInputDialog("Por favor, digite o valor em Reais que você deseja converter:");
     double valorReal = Double.parseDouble(valor);
     final double euro = 5.03; 
     double valorConvertido = valorReal/euro;
     String mensagem;
     mensagem = "O valor convertido em Euros, é de: "+valorConvertido;
     JOptionPane.showMessageDialog(null,mensagem);
     }
     
     if (opcao == 2){
     String valor;
     valor = JOptionPane.showInputDialog("Por favor, digite o valor em Reais que você deseja converter:");
     double valorReal = Double.parseDouble(valor);
     final double dolar = 5.03; 
     double valorConvertido = valorReal/dolar;
     String mensagem;
     mensagem = "O valor convertido em Dólares, é de: "+valorConvertido;
     JOptionPane.showMessageDialog(null,mensagem);
     }
     
     if (opcao == 3){
     String valor;
     valor = JOptionPane.showInputDialog("Por favor, digite o valor em Reais que você deseja converter:");
     double valorReal = Double.parseDouble(valor);
     final double libra = 5.89; 
     double valorConvertido = valorReal/libra;
     String mensagem;
     mensagem = "O valor convertido em Libras, é de: "+valorConvertido;
     JOptionPane.showMessageDialog(null,mensagem);
     
     }
     
    }
}

