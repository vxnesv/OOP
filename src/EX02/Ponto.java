package EX02;

public class Ponto {
    int x;
    int y;

    //metodo para calcular e retornar a distancia entre dois pontos
    public double calcularDistancia(Ponto p) {
        double distancia;
        distancia = Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
        return distancia;
    }

    //metodo para calcular e retornar a distancia de um ponto ate a origem
    public double calcularOrigem() {
        double distancia;
        Ponto origem = new Ponto();
        distancia = calcularDistancia(origem);
        return distancia;
    }

    //metodo para retornar os dados do objeto formatado
    public String formatarPonto(){
        return "(" + x + "," + y + ")";
    }

    //metodo para retornar o ponto mais proximo da origem
    public Ponto maisProximo(Ponto p1, Ponto p2){
        double dp1 = p1.calcularOrigem();
        double dp2 = p2.calcularOrigem();
        if(dp1 < dp2){
            return p1;
        }
        return p2;
    }



}
