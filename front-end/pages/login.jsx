'use strict';

import TextInput from "../components/inputs/TextInput";
import RegisterForm from "../components/RegisterForm";
import Header from "../components/Header";
import Footer from "../components/Footer";
import Image from 'next/image';

export default function Page() {
  return (
    <center>

      <Header
        title="RuBank"
        description="RuBank é um banco criado para a disciplina de IP-2"
      />

      <div className="w-6/12 py-8">
        <h3 className="text-3xl">Login</h3>

        <br />

        <TextInput
          id="email"
          label="Email"
          placeholder="Digite seu email"
          onChange={(event) => { return; }}
          rounded_full
        />

        <TextInput
          id="password"
          label="Senha"
          placeholder="Digite sua senha"
          onChange={(event) => { return; }}
          rounded_full
        />

        <br />

        <button className="bg-purple-800 text-white rounded-full px-4 py-2">
          Entrar
        </button>

        <br />
      </div>

      <br />

      <Footer />

    </center>
  );
}
