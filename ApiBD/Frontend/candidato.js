//sem saber quando o dado será obtido
async function cadastraCandidato(){
   // recupera os dados para inserção
   let nome = document.getElementById("nome").value
   let partido = document.getElementById("partido").value
   let idade = Number(document.getElementById("idade").value)
   let nota = Number(document.getElementById("nota").value)

   //cria um objeto com os dados do usuário
   let candidato = {
       nome, partido, idade, nota
   }

   //Efetivamente chama a API
   await fetch(`http://localhost:8080/api/candidato`,{
       method: 'POST',
       body: JSON.stringify(candidato),
       headers:{
           "Content-Type": "application/json; charset=UTF-8"
       }
   })
   .then (resposta => alert(`Candidato inserido com sucesso`))
   .catch (erro => alert(erro))
   //limpa os campos
   document.getElementById("nome").value
   document.getElementById("partido").value
   document.getElementById("idade").value
   document.getElementById("nota").value

}

async function consultaCandidatos(){
    let candidatos = await fetch(`http://localhost:8080/api/candidato`)
    .then(resposta => {
        return resposta.json()}) // Converte para JSON
    .catch (erro => alert(erro))
    
    //Para cada candidato
    let conteudoTabela = ''
    candidatos.forEach(candidato => {
        conteudoTabela += `<tr> <td> ${candidato.nome} </td> <td> ${
            candidato.partido} </td> <td> ${candidato.idade} </td> <td> ${
                candidato.nota} </td> <td> <i onClick="" class='bi bi-trash' </i> </td> 
                <td> <i onClick="" class='bi bi-pencil' </i> </td> </tr>`
    })
    document.getElementById("conteudoTabela").innerHTML = conteudoTabela                   
}