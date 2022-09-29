'use strict';

import { Component } from "react";

export default class Header extends Component {
  constructor(props) {
    super(props);
  }

  render() {
    return (
      <center>
        <div className="bg-purple-800 py-4">
          <h1 className="text-sm font-semibold text-white">
            RuBank 2022. Todos os direitos reservados.
          </h1>
        </div>
      </center>
    );
  }
}