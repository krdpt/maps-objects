"use strict";
var __defProp = Object.defineProperty;
var __getOwnPropDesc = Object.getOwnPropertyDescriptor;
var __getOwnPropNames = Object.getOwnPropertyNames;
var __hasOwnProp = Object.prototype.hasOwnProperty;
var __export = (target, all) => {
  for (var name in all)
    __defProp(target, name, { get: all[name], enumerable: true });
};
var __copyProps = (to, from, except, desc) => {
  if (from && typeof from === "object" || typeof from === "function") {
    for (let key of __getOwnPropNames(from))
      if (!__hasOwnProp.call(to, key) && key !== except)
        __defProp(to, key, { get: () => from[key], enumerable: !(desc = __getOwnPropDesc(from, key)) || desc.enumerable });
  }
  return to;
};
var __toCommonJS = (mod) => __copyProps(__defProp({}, "__esModule", { value: true }), mod);

// src/index.ts
var src_exports = {};
__export(src_exports, {
  Stop: () => Stop,
  Vehicle: () => Vehicle,
  VehicleInfo: () => VehicleInfo,
  VehicleType: () => VehicleType
});
module.exports = __toCommonJS(src_exports);

// src/stop.ts
var Stop = class {
  id;
  index;
  name;
  description;
  lat;
  lon;
  routes;
  transport;
  kttu;
  trolley;
  tram;
  constructor(data) {
    this.id = data["id"];
    this.index = data["index"];
    this.name = data["name"];
    this.description = data["description"];
    this.lat = data["lat"];
    this.lon = data["lon"];
    this.routes = data["routes"];
    this.transport = data["transport"];
    this.kttu = data["kttu"];
    this.trolley = data["trolley"];
    this.tram = data["tram"];
  }
};

// src/vehicle.ts
var Vehicle = class {
  id;
  type;
  registration_number;
  model;
  route;
  route_id;
  lat;
  lng;
  speed;
  arrow;
  kttu;
  long;
  routeless;
  constructor(data) {
    this.id = data["id"];
    this.registration_number = data["registration_number"];
    this.model = data["model"];
    this.type = data["type"];
    this.route = data["route"];
    this.route_id = data["route_id"];
    this.lat = data["lat"];
    this.lng = data["lng"];
    this.speed = data["speed"];
    this.arrow = data["arrow"];
    this.kttu = data["kttu"];
    this.long = data["long"];
    this.routeless = data["routeless"];
  }
};
var VehicleInfo = class {
  num;
  model;
  years;
  factory_id;
  built_in;
  exploitation_since;
  depot;
  registration_number;
  comment;
  more_url;
  image_url;
  small_image_url;
  tags;
  constructor(data) {
    this.num = data["num"];
    this.model = data["model"];
    this.years = data["years"];
    this.factory_id = data["factory_id"];
    this.built_in = data["built_in"];
    this.exploitation_since = data["exploitation_since"];
    this.depot = data["depot"];
    this.registration_number = data["registration_number"];
    this.comment = data["comment"];
    this.more_url = data["more_url"];
    this.image_url = data["image_url"];
    this.small_image_url = data["small_image_url"];
    this.tags = data["tags"];
  }
};
var VehicleType = /* @__PURE__ */ ((VehicleType2) => {
  VehicleType2["TROLLEY"] = "trolley";
  VehicleType2["BUS"] = "bus";
  VehicleType2["EBUS"] = "ebus";
  VehicleType2["TRAM"] = "tram";
  VehicleType2["SERVICE"] = "service";
  VehicleType2["COMMERCIAL"] = "commercial";
  return VehicleType2;
})(VehicleType || {});
// Annotate the CommonJS export names for ESM import in node:
0 && (module.exports = {
  Stop,
  Vehicle,
  VehicleInfo,
  VehicleType
});
