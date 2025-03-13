function GeneraLetraDNI(numeroDNi){
    let elementoInput = document.getElementById("dni");
    let letracorrecta = 0;
    let respuesta = "No se trata de un DNi Correcto."
    const letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'];
    if(numeroDNi.length == 8 || !isNaN(numeroDNi) || Number(numeroDNi)>99999999){
        let resto = Number(numeroDNi) % 23;
        letracorrecta = letras[resto];
        respuesta = numeroDNi + letra
    }
    return respuesta;
}