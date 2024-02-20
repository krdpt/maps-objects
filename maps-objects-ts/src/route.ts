export class Points {
    public readonly data: any[]
    public readonly dic: string[]

    public constructor(data: any) {
        this.data = data['data']
        this.dic = data['dic']
    }
}

export class RoutePart {
    public readonly direction: number
    public readonly id: number
    public readonly points: Points

    public constructor(data: any) {
        this.direction = data['direction']
        this.id = data['id']
        this.points = data['points']
    }
}

export class Direction {
    public readonly forward: string;
    public readonly backward: string;

    public constructor(data: any) {
        this.forward = data['forward']
        this.backward = data['backward']
    }
}

export class Provider {
    public readonly kttu: boolean;
    public readonly name: string;
    public readonly address: string;

    public constructor(data: any) {
        this.kttu = data['kttu']
        this.name = data['name']
        this.address = data['address']
    }
}

export class Vehicles {
    public readonly type: string;
    public readonly class: string;
    public readonly other: string;

    public constructor(data: any) {
        this.type = data['type']
        this.class = data['class']
        this.other = data['other']
    }
}

export class RegistryRoute {
    public readonly id: number;
    public readonly route: string;
    public readonly directions: string;

    public readonly stops: Direction;
    public readonly streets: Direction;
    public readonly length: Direction;

    public readonly stopRule: string;
    public readonly type: string;

    public readonly vehicles: Vehicles;
    public readonly provider: Provider;

    public readonly maxVehicles: string;
    public readonly maxVehiclesCount: number;

    public constructor(data: any) {
        this.id = data['id']
        this.route = data['route']
        this.directions = data['directions']

        this.stops = data['stops']
        this.streets = data['streets']
        this.length = data['length']

        this.stopRule = data['stopRule']
        this.type = data['type']

        this.vehicles = data['vehicles']
        this.provider = data['provider']

        this.maxVehicles = data['maxVehicles']
        this.maxVehiclesCount = data['maxVehiclesCount']
    }
}