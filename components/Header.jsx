'use strict';

import { Component } from "react";
import Head from "next/head";

export default class Header extends Component {
  constructor(props) {
    super(props);
  }

  render() {
    return (
      <center>

        <Head>
          <title>{this.props.title}</title>
          <meta name="description" content={this.props.description} />
          <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        </Head>

        <div className="bg-purple-800 py-4">
          <h1 className="text-2xl sm:text-3xl font-semibold text-white">
            RuBank
          </h1>
        </div>
      </center>
    );
  }
}