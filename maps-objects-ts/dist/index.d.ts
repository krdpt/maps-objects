export class Stop {
    constructor(data: {
        id: string;
        index: number;
        name: string;
        description: string;
        lat: number;
        lon: number;
        routes: any[];
        transport: any;
        kttu: any;
        trolley: any;
        tram: any;
    });
    id: string;
    index: number;
    name: string;
    description: string;
    lat: number;
    lon: number;
    routes: any[];
    transport: any;
    kttu: any;
    trolley: any;
    tram: any;
}

export class Vehicle {
    constructor(data: {
        id: string;
        registration_number: string;
        model: string;
        type: string;
        route: any;
        route_id: any;
        lat: number;
        lng: number;
        speed: number;
        arrow: any;
        kttu: any;
        long: any;
        routeless: any;
    });
    id: string;
    registration_number: string;
    model: string;
    type: string;
    route: any;
    route_id: any;
    lat: number;
    lng: number;
    speed: number;
    arrow: any;
    kttu: any;
    long: any;
    routeless: any;
}

export class VehicleInfo {
    constructor(data: {
        num: any;
        model: string;
        years: any;
        factory_id: any;
        built_in: any;
        exploitation_since: any;
        depot: any;
        registration_number: string;
        comment: any;
        more_url: any;
        image_url: any;
        small_image_url: any;
        tags: any;
    });
    num: any;
    model: string;
    years: any;
    factory_id: any;
    built_in: any;
    exploitation_since: any;
    depot: any;
    registration_number: string;
    comment: any;
    more_url: any;
    image_url: any;
    small_image_url: any;
    tags: any;
}

export enum VehicleType {
    TROLLEY = "trolley",
    BUS = "bus",
    EBUS = "ebus",
    TRAM = "tram",
    SERVICE = "service",
    COMMERCIAL = "commercial",
}
