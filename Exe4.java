package logic_test;

public class Exe4 {
        public static void main(String[] args) {
            // Distância entre as cidades de Ribeirão Preto e Franca em km
            int distanciaRP_Franca = 100;
    
            // Velocidade do carro em km/h
            int velocidadeCarro = 110;
    
            // Velocidade do caminhão em km/h
            int velocidadeCaminhao = 80;
    
            // Tempo em horas que o caminhão leva para passar em cada pedágio
            double tempoPedagioCaminhao = 5.0 / 60.0;
    
            // Distância percorrida pelo carro até o ponto de encontro em km
            double distanciaCarro = distanciaRP_Franca / 2.0;
    
            // Tempo em horas que o carro leva até o ponto de encontro
            double tempoCarro = distanciaCarro / velocidadeCarro;
    
            // Tempo em horas que o caminhão leva até o ponto de encontro, considerando os pedágios
            double tempoCaminhao = (distanciaRP_Franca - distanciaCarro) / (velocidadeCaminhao * (1 + tempoPedagioCaminhao));
    
            // Distância percorrida pelo caminhão até o ponto de encontro em km
            double distanciaCaminhao = velocidadeCaminhao * tempoCaminhao;
    
            // Verifica qual veículo está mais próximo de Ribeirão Preto
            if (distanciaCarro < distanciaCaminhao) {
                System.out.println("O carro está mais próximo de Ribeirão Preto.");
            } else {
                System.out.println("O caminhão está mais próximo de Ribeirão Preto.");
            }
            System.out.println("O programa calcula a distância percorrida e o tempo que cada veículo leva para chegar ao ponto de encontro, levando em conta a velocidade e o tempo que o caminhão leva para passar pelos pedágios. Depois, o programa verifica qual veículo está mais próximo de Ribeirão Preto e imprime essa informação na tela. Para isso, são usadas variáveis que armazenam as informações relevantes, como a distância entre as cidades e as velocidades dos veículos, e operações matemáticas simples, como multiplicação e divisão, para realizar os cálculos necessários.");
        }
    }
    
