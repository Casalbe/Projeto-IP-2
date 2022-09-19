'use strict';

import { Component } from "react";

export default class DateInput extends Component {
  #divClass = "p-2";
  #inputClass = "px-4 py-1 mt-1 w-full border-2 text-lg";

  constructor(props) {
    super(props);

    if (props.rounded_full) { this.#inputClass += " rounded-full"; }
    else if (props.rounded_xl) { this.#inputClass += " rounded-xl"; }
    else if (props.rounded_lg) { this.#inputClass += " rounded-lg"; }
    else if (props.rounded_md) { this.#inputClass += " rounded-md"; };

    this.state = {
      value: "",
      borderColor: "gray-400",
    }
  }

  render() {
    return (
      <div className={this.#divClass}>
        <label
          className={`text-lg font-semibold leading-5 text-${this.props.color}`}
          htmlFor={this.props.id}
        >
          {this.props.label}
        </label>
        <input
          className={`${this.#inputClass} border-${this.state.borderColor}`}
          id={this.props.id}
          type="date"
          value={this.state.value}
          onChange={this.#handleChange}
          onBlur={this.#handleChange}
        />
      </div>
    );
  }

  #handleChange = (event) => {
    this.setState({ value: event.target.value });
    if (event.target.value.length > 0) {
      this.props.onChange(this.state.value);
      this.setState({ borderColor: "gray-400" });
    } else {
      this.props.onChange(false);
      this.setState({ borderColor: "red-600" });
      this.forceUpdate();
    };
  }
}