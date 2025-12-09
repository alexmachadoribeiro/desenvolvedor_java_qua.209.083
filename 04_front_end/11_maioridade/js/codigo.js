const form = document.querySelector('form');

// função para calcular a maioridade
const maioridade = () => {
    // declaração de variáveis locais
    let nome = document.querySelector('#nome').value;
    let idade = document.querySelector('#idade').value;
    const result = (idade >= 18) ? 'é maior de idade' : 'é menor de idade';

    // saída de dados
    document.querySelector('#result').innerHTML = `${nome} ${result}.`;

    // limpa valores
    document.querySelector('#nome').value = '';
    document.querySelector('#idade').value = '';
}

// evento
form.addEventListener('submit', function(event) {
    event.preventDefault();
    maioridade();
});