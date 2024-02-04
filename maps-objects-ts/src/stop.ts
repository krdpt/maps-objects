import {VehicleType} from "./vehicle.ts";

export class Stop {
    public readonly id: string;
    public readonly index: number;

    public readonly name: string;
    public readonly description: string;

    public readonly lat: number;
    public readonly lon: number;

    public readonly routes: string[];
    public readonly transport: VehicleType;

    public readonly kttu: string | null;
    public readonly trolley: string | null;
    public readonly tram: string | null;

    public constructor(data: any) {
        this.id = data['id']
        this.index = data['index']
        this.name = data['name']
        this.description = data['description']
        this.lat = data['lat']
        this.lon = data['lon']
        this.routes = data['routes']
        this.transport = data['transport']
        this.kttu = data['kttu']
        this.trolley = data['trolley']
        this.tram = data['tram']
    }
}