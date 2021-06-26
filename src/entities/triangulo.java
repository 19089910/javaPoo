package entidades;
//Quais são os benefícios de se calcular a área de um triângulo por meio de um
//MÉTODO dentro da CLASSE Triangle?
//1) Reaproveitamento de código: nós eliminamos o código repetido (cálculo
//das áreas dos triângulos x e y) no programa principal.
//2) Delegação de responsabilidades: quem deve ser responsável por saber
//como calcular a área de um triângulo é o próprio triângulo. A lógica do cálculo
//da área não deve estar em outro lugar
public class triangulo {
    public double ladoA;
    public double ladoB;
    public double ladoC;

    public double area(){
        double p = (ladoA + ladoB + ladoC) / 2.0;
        return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
    }
}
