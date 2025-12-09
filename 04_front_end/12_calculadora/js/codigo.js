const form = document.querySelector('form');

const calcular = () => {
    // declaração de variáveis locais
    let x = document.querySelector('#x').value;
    let y = document.querySelector('#y').value;
    let operador = document.querySelector('#operador').value;
    let result = 0;

    // verifica a operação selecionada
    switch (operador) {
        case 'soma':
            result = x+y;
            document.querySelector('#result').innerHTML = result;
            break;
        // TODO: terminar switch
    }
}

form.addEventListener('submit', function(event) {
    event.preventDefault();
    calcular();
});