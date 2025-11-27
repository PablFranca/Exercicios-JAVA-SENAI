async function buscarUsuario(){
    const id = document.getElementById('id').value;
    if(!id){
        alert('Por favor digite um ID válido')
    }
    try{
        const resposta = await fetch(`http://localhost:8080/api/clientes/${id}`);
        const dados = await resposta.json();
         
        document.getElementById("dados").textContent = JSON.stringify(dados.nomeCompleto, null, 2);
    
    }catch(err){
        console.log('Erro', err);
        document.getElementById("dados").textContent = JSON.stringify(dados, null,2);
    }
}