import javax.swing.*;
import java.awt.GridLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class TelaPDV extends JFrame {


    private ArrayList<Produto>  Produto = new ArrayList<>();
    private Venda venda = new Venda();
    private Caixa caixa = new Caixa();


    public TelaPDV (){
        setTitle("Frente de Loja");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3,1));

        JPanel panelProduto = new JPanel();
        panelProduto.setBorder(BorderFactory.createTitledBorder("produto"));


        panelProduto.setLayout(new GridLayout(4,2));

        panelProduto.add(new JLabel("Codigo:"));
        JTextField textCodigo = new JTextField();
        panelProduto.add(textCodigo);

        panelProduto.add(new JLabel("Nome:"));
        JTextField textNome = new JTextField();
        panelProduto.add(textNome);

        panelProduto.add(new JLabel("Preço:"));
        JTextField textPreco = new JTextField();
        panelProduto.add(textPreco);

        panelProduto.add(new JLabel("Estoque:"));
        JTextField textEstoque = new JTextField();
        panelProduto.add(textEstoque);

        add(panelProduto);

        JPanel panelVenda = new JPanel();
        panelVenda.setBorder(BorderFactory.createTitledBorder("Venda"));
        panelVenda.setLayout(new GridLayout(3,2));

        panelVenda.add(new JLabel("Codigo do produto"));
        JTextField txtCodigoVenda = new JTextField();
        panelVenda.add(txtCodigoVenda);

        panelVenda.add(new JLabel("Quantidade"));
        JTextField txtQuantidade = new JTextField();
        panelVenda.add(txtQuantidade);

        JButton btnAdicionar = new JButton("adicionar");
        panelVenda.add(btnAdicionar);

        add(panelVenda);

        setVisible(true);

        JLabel panelFinaceiro = new JLabel();
        panelFinaceiro.setBorder(BorderFactory.createTitledBorder("Finaceiro"));
        panelFinaceiro.setLayout(new GridLayout(5,2));

        panelFinaceiro.add(new JLabel("ToTal:"));
        JTextField textTotal = new JTextField();
        panelFinaceiro.add(textTotal);

        panelFinaceiro.add(new JLabel("Valor entrege:"));
        JTextField textValopago = new JTextField();
        panelFinaceiro.add(textValopago);

        panelFinaceiro.add(new JLabel("Troco:"));
        JTextField textTroco = new JTextField();
        panelFinaceiro.add(textTroco);

        JButton btnNovavenda = new JButton("Nova venda");
        JButton btnFimcrompra= new JButton("Finalizar compra");
        JButton btnCancelar = new JButton("Cancerlar ");

        panelFinaceiro.add(btnNovavenda);
        panelFinaceiro.add(btnFimcrompra);
        panelFinaceiro.add(btnCancelar);

        add(panelFinaceiro);

    }
}
