import { Home, Truck, User } from "react-native-feather";
import HomeTabStack from "./Home";
import Profile from "./Profile/Profile";
import Sales from "./Sales/Sales";

export const menuOptions = [
  {
    name: "Bienvenido a Almacen Nancy!",
    component: HomeTabStack,
    icon: <Home width={32} height={32} color={'black'} />,
    label: "Productos",
    color: "lightgray"
  }, {
    name: "Sales",
    component: Sales,
    icon: <Truck width={32} height={32} color={'black'} />,
    label: "Ventas",
    color: "lightgray"
  }, {
    name: "Profile",
    component: Profile,
    icon: <User width={32} height={32} color={'black'} />,
    label: "Perfil",
    color: "lightgray"
  }
];