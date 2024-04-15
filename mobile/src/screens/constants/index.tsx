import { Home, Truck, User } from "react-native-feather";
import HomeTabStack from "../../Navigates/HomeTabStack";
import Profile from "../Profile";
import Sales from "../Sales";

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