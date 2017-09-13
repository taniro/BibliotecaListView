package tads.eaj.com.bibliotecalistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    ListView lista;
    List<Livro> listaLivros = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.minhalista);

        carregaLivros();

        lista.setAdapter(new LivroAdapter(this, listaLivros));
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Livro livro = listaLivros.get(i);
                Toast.makeText(MainActivity.this, ""+livro.getTitulo(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void carregaLivros(){

        listaLivros.add(new Livro("Harry Potter e a pedra filosofal", "J. K. Rowling", 2, true));
        listaLivros.add(new Livro("Harry Potter e a Câmara Secreta", "J. K. Rowling", 3, true));
        listaLivros.add(new Livro("Harry Potter e o Prisioneiro de Azkaban", "J. K. Rowling", 5, true));
        listaLivros.add(new Livro("Harry Potter e o Cálice de Fogo", "J. K. Rowling", 2, true));
        listaLivros.add(new Livro("Harry Potter e a Ordem da Fênix", "J. K. Rowling", 1, false));
        listaLivros.add(new Livro("Harry Potter e o Enigma do Príncipe", "J. K. Rowling", 3, false));
        listaLivros.add(new Livro("Harry Potter e as Relíquias da Morte", "J. K. Rowling", 2, false));
        listaLivros.add(new Livro("O pistoleiro", "Stephen King", 1, true));
        listaLivros.add(new Livro("A Escolha dos Três ", "Stephen King", 5, true));
        listaLivros.add(new Livro("As Terras Devastadas", "Stephen King", 4, true));
        listaLivros.add(new Livro("Mago e Vidro", "Stephen King", 3, true));
        listaLivros.add(new Livro("Lobos de Calla", "Stephen King", 2, false));
        listaLivros.add(new Livro("Canção de Susannah", "Stephen King", 4, false));
        listaLivros.add(new Livro("A Torre Negra", "Stephen King", 5, false));
        listaLivros.add(new Livro("O Vento Pela Fechadura", "Stephen King", 5, true));
        listaLivros.add(new Livro("Viagem ao centro da terra ", "Júlio Verne", 3, false));
        listaLivros.add(new Livro("Senhor dos Anéis: a sociedade do anel", "Tolkien", 1, true));
        listaLivros.add(new Livro("Senhor dos Anéis: as duas torres", "Tolkien", 1, true));
        listaLivros.add(new Livro("Senhor dos Anéis: o retorno do rei", "Tolkien", 1, true));
        listaLivros.add(new Livro("Dom Casmurro", "Machado de Assis", 4, false));

        for (int i = 0; i<50000; i++ ){
            listaLivros.add(new Livro("Livro "+i, "Autor "+i, 2, false));
        }
    }
}
