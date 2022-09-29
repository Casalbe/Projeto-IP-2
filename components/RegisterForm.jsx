'use strict';

import SelectInput from "./inputs/SelectInput";
import EmailInput from "./inputs/EmailInput";
import TextInput from "./inputs/TextInput";
import DateInput from "./inputs/DateInput";
import { Component } from "react";
import axios from "axios";

export default class RegisterForm extends Component {
  #name;
  #cpf;
  #email;
  #state;
  #zipCode;
  #birthDate;


  constructor(props) {
    super(props);
  }

  render() {
    return (
      <center className="w-11/12 md:w-6/12 my-8 rounded-xl border-2 border-purple-800">

        <form className="p-6">
          <h3 className="text-xl">Registre-se</h3>

          <TextInput
            id="name"
            label="Nome"
            placeholder="Digite seu nome"
            rounded_full
            onChange={(value) => { this.#name = value; }}
          />

          <TextInput
            id="cpf"
            label="CPF"
            placeholder="Digite seu CPF"
            rounded_full
            onChange={(value) => { this.#cpf = value; }}
          />

          <DateInput
            id="birthDate"
            label="Data de nascimento"
            rounded_full
            onChange={(value) => { this.#birthDate = value; }}
          />

          <SelectInput
            id="estado"
            label="Estado"
            placeholder="Selecione seu estado"
            rounded_full
            options={[
              "Acre",
              "Alagoas",
              "Amapá",
              "Amazonas",
              "Bahia",
              "Ceará",
              "Distrito Federal",
              "Espírito Santo",
              "Goiás",
              "Maranhão",
              "Mato Grosso",
              "Mato Grosso do Sul",
              "Minas Gerais",
              "Pará",
              "Paraíba",
              "Paraná",
              "Pernambuco",
              "Piauí",
              "Rio de Janeiro",
              "Rio Grande do Norte",
              "Rio Grande do Sul",
              "Rondônia",
              "Roraima",
              "Santa Catarina",
              "São Paulo",
              "Sergipe",
              "Tocantins",
            ]}
            onChange={(value) => { this.#state = value; }}
          />

          <TextInput
            id="zipCode"
            label="CEP"
            placeholder="Digite seu CEP"
            rounded_full
            onChange={(value) => { this.#zipCode = value; }}
          />

          <EmailInput
            id="email"
            label="E-mail"
            placeholder="Digite seu e-mail"
            rounded_full
            onChange={(value) => { this.#email = value; }}
          />

          <button
            type="submit"
            className="w-full bg-purple-800 text-white rounded-full py-2 mt-4"
            onClick={(event) => {
              event.preventDefault();
              this.#handleSubmit();
            }}
          >
            Registrar
          </button>
        </form>
      </center>
    );
  }

  #handleSubmit = () => {
    if (this.#name && this.#cpf && this.#email && this.#state && this.#zipCode && this.#birthDate) {
      console.log(this.#birthDate);

      axios.post("http://localhost:8080/pessoa/registrar", {
        name: this.#name,
        cpf: this.#cpf,
        email: this.#email,
        state: this.#state,
        zipCode: this.#zipCode,
        birthDate: this.#birthDate,
      }).then((response) => {
        alert("Formulário enviado com sucesso!");
      }).catch((error) => {
        alert("Erro ao enviar formulário!");
      });
    } else {
      alert("Preencha todos os campos!");
    }
  }
}