package challenge;

public class App {

        public static void main(String[] args){


            Estacionamento estacionamento = new Estacionamento();
            estacionamento.estacionar(
                    Carro.builder()
                            .withMotorista(
                                    Motorista
                                            .builder()
                                            .withNome("maria")
                                            .withIdade(22)
                                            .withPontos(18)
                                            .withHabilitacao("B")
                                            .build())
                            .withPlaca("GFR2341")
                            .withCor( Cor.COLORIDO)
                            .build()
            );

            estacionamento.estacionar(
                    Carro.builder()
                            .withMotorista(
                                    Motorista
                                            .builder()
                                            .withNome("charles")
                                            .withIdade(21)
                                            .withPontos(12)
                                            .withHabilitacao("A")
                                            .build())
                            .withPlaca("BHG4534")
                            .withCor( Cor.BRANCO).build()
            );

            estacionamento.estacionar(
                    Carro.builder()
                            .withMotorista(
                                    Motorista
                                            .builder()
                                            .withNome("marcos")
                                            .withIdade(29)
                                            .withPontos(9)
                                            .withHabilitacao("AB")
                                            .build())
                            .withPlaca("VBF7689")
                            .withCor( Cor.PRETO).build()
            );

            estacionamento.estacionar(
                    Carro.builder()
                            .withMotorista(
                                    Motorista
                                            .builder()
                                            .withNome("mario")
                                            .withIdade(43)
                                            .withPontos(10)
                                            .withHabilitacao("B")
                                            .build())
                            .withPlaca("RED7896")
                            .withCor( Cor.BRANCO).build()
            );

            estacionamento.estacionar(
                    Carro.builder()
                            .withMotorista(
                                    Motorista
                                            .builder()
                                            .withNome("jairo")
                                            .withIdade(45)
                                            .withPontos(19)
                                            .withHabilitacao("A")
                                            .build())
                            .withPlaca("mnb7865")
                            .withCor( Cor.COLORIDO).build()
            );

            estacionamento.estacionar(
                    Carro.builder()
                            .withMotorista(
                                    Motorista
                                            .builder()
                                            .withNome("kaio")
                                            .withIdade(47)
                                            .withPontos(2)
                                            .withHabilitacao("AB")
                                            .build())
                            .withPlaca("klj5467")
                            .withCor( Cor.COLORIDO).build()
            );

            estacionamento.estacionar(
                    Carro.builder()
                            .withMotorista(
                                    Motorista
                                            .builder()
                                            .withNome("manuel")
                                            .withIdade(53)
                                            .withPontos(9)
                                            .withHabilitacao("AB")
                                            .build())
                            .withPlaca("cxz3422")
                            .withCor( Cor.BRANCO).build()
            );

            estacionamento.estacionar(
                    Carro.builder()
                            .withMotorista(
                                    Motorista
                                            .builder()
                                            .withNome("Leone")
                                            .withIdade(34)
                                            .withPontos(15)
                                            .withHabilitacao("A")
                                            .build())
                            .withPlaca("nhy8909")
                            .withCor( Cor.COLORIDO).build()
            );

            estacionamento.estacionar(
                    Carro.builder()
                            .withMotorista(
                                    Motorista
                                            .builder()
                                            .withNome("rui")
                                            .withIdade(29)
                                            .withPontos(14)
                                            .withHabilitacao("AB")
                                            .build())
                            .withPlaca("zas2345")
                            .withCor( Cor.PRETO).build()
            );

            estacionamento.estacionar(
                    Carro.builder()
                            .withMotorista(
                                    Motorista
                                            .builder()
                                            .withNome("henrique")
                                            .withIdade(40)
                                            .withPontos(11)
                                            .withHabilitacao("B")
                                            .build())
                            .withPlaca("cvb5678")
                            .withCor( Cor.COLORIDO).build()
            );

            estacionamento.estacionar(
                    Carro.builder()
                            .withMotorista(
                                    Motorista
                                            .builder()
                                            .withNome("helio")
                                            .withIdade(27)
                                            .withPontos(10)
                                            .withHabilitacao("B")
                                            .build())
                            .withPlaca("kuw6789")
                            .withCor( Cor.BRANCO).build()
            );

            estacionamento.estacionar(
                    Carro.builder()
                            .withMotorista(
                                    Motorista
                                            .builder()
                                            .withNome("marcela")
                                            .withIdade(18)
                                            .withPontos(10)
                                            .withHabilitacao("A")
                                            .build())
                            .withPlaca("mju7689")
                            .withCor( Cor.COLORIDO).build()
            );

            System.out.println(estacionamento.carrosEstacionados());
        }
    }


