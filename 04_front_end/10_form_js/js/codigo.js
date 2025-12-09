// declaração de variáveis globais
const form = document.querySelector('form');

form.addEventListener('submit', function(event) {
    // desativa o submit
    event.preventDefault();

    // declaração de variáveis locais
    let texto = document.querySelector('#texto').value;

    // exibe o texto em forma de caixa de diálogo
    alert(texto);
});