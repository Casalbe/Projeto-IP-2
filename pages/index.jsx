'use strict';

import RegisterForm from "../components/RegisterForm";
import Header from "../components/Header";
import Footer from "../components/Footer";
import Image from 'next/image';
import Link from "next/link";

export default function Page() {
  return (
    <center>

      <Header
        title="RuBank"
        description="RuBank é um banco criado para a disciplina de IP-2"
      />

      <div>
        <Image
          src="/images/apresentation_1.png"
          alt="Ilustração de um homem navegando na internet"
          width={450}
          height={300}
        />
      </div>

      <div className="p-8 text-lg sm:text-xl">
        <p>
          Olá, nós somos o RuBank, o banco que te ajuda com o seu dinheiro :)
        </p>
      </div>

      <div>
        <button className="bg-purple-800 text-white rounded-full px-4 py-2">
          <Link href="/login">
            <a>Entrar</a>
          </Link>
        </button>
      </div>

      <div className="p-8 text-lg sm:text-xl">
        <p>Ainda não tem uma conta?</p>
        <br />
        <p>
          Cadastre já suas informações e vamos começar a te ajudar!
        </p>
      </div>

      <RegisterForm />

      <Footer />

    </center>
  );
}