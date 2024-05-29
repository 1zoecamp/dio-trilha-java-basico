/* const { salario, beneficio } = require("./entradas")  */
const calcularSalario = require("./calculoSalario");
const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("Digite o salário: ", (salario) => {
  rl.question("Digite o benefício: ", (beneficio) => {
    const valorSalario = parseFloat(salario)
    const valorBeneficio = parseFloat(beneficio)
    calcularSalario(valorSalario, valorBeneficio);

    rl.close();
  });
});
