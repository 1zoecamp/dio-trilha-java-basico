module.exports = function calcularSalario(salario, beneficio) {
  let salarioDescontado = 0;

  if (salario > 0 && salario <= 1100) {
    salarioDescontado = salario * 0.95;
  } else if (salario >= 1100.01 && salario <= 2500) {
    salarioDescontado = salario * 0.9;
  } else if (salario >= 1100.01 && salario <= 2500) {
    salarioDescontado = salario * 0.85;
  } else {
    console.log("O salário informado é inválido");
  }

  const salarioCalculado = salarioDescontado + beneficio
  console.log("O salário calculado é R$ " + salarioCalculado)
}

