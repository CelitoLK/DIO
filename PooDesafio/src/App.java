// Interface ReprodutorMusical
interface ReprodutorMusical {
    void tocar();

    void pausar();

    void selecionarMusica(String musica);
}

// Interface AparelhoTelefonico
interface AparelhoTelefonico {
    void ligar(String numero);

    void atender();

    void iniciarCorreioVoz();
}

// Interface NavegadorInternet
interface NavegadorInternet {
    void exibirPagina(String url);

    void adicionarNovaAba(String url);

    void atualizarPagina();
}

// Classe IPhone que implementa as interfaces
class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private boolean ligado = false;
    private boolean tocandoMusica = false;
    private boolean emChamada = false;
    private String paginaAtual = "";

    // Implementação dos métodos da interface ReprodutorMusical
    public void tocar() {
        if (ligado && !emChamada) {
            System.out.println("Tocando música");
            tocandoMusica = true;
        } else {
            System.out.println("Não é possível tocar música no momento.");
        }
    }

    public void pausar() {
        if (ligado && tocandoMusica) {
            System.out.println("Música pausada");
            tocandoMusica = false;
        } else {
            System.out.println("Não é possível pausar a música no momento.");
        }
    }

    public void selecionarMusica(String musica) {
        if (ligado && !emChamada) {
            System.out.println("Selecionando a música: " + musica);
        } else {
            System.out.println("Não é possível selecionar música no momento.");
        }
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    public void ligar(String numero) {
        if (!ligado) {
            System.out.println("Ligando para o número: " + numero);
            ligado = true;
        } else {
            System.out.println("Já existe uma chamada em andamento.");
        }
    }

    public void atender() {
        if (ligado && emChamada) {
            System.out.println("Chamada atendida");
        } else {
            System.out.println("Não há chamadas para atender.");
        }
    }

    public void iniciarCorreioVoz() {
        if (ligado && emChamada) {
            System.out.println("Iniciando correio de voz");
        } else {
            System.out.println("Não é possível iniciar o correio de voz no momento.");
        }
    }

    // Implementação dos métodos da interface NavegadorInternet
    public void exibirPagina(String url) {
        if (ligado) {
            System.out.println("Exibindo página: " + url);
            paginaAtual = url;
        } else {
            System.out.println("O iPhone está desligado. Ligue-o para usar a internet.");
        }
    }

    public void adicionarNovaAba(String url) {
        if (ligado) {
            System.out.println("Abrindo uma nova aba com a página: " + url);
        } else {
            System.out.println("O iPhone está desligado. Ligue-o para usar a internet.");
        }
    }

    public void atualizarPagina() {
        if (ligado && !emChamada) {
            System.out.println("Atualizando a página: " + paginaAtual);
        } else {
            System.out.println("Não é possível atualizar a página no momento.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        // Usando o iPhone como Reprodutor de Música
        iphone.tocar();
        iphone.selecionarMusica("Música 1");
        iphone.pausar();

        // Usando o iPhone como Aparelho Telefônico
        iphone.ligar("123-456-789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Usando o iPhone como Navegador na Internet
        iphone.exibirPagina("www.exemplo.com");
        iphone.adicionarNovaAba("www.google.com");
        iphone.atualizarPagina();
    }
}
