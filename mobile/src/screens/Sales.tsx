import { BottomTabNavigationProp } from "@react-navigation/bottom-tabs";

export type RootTabParamList = {
    Sales: undefined;
};

type SalesTabNavigationProp = BottomTabNavigationProp<RootTabParamList, 'Sales'>;

interface SalesProps {
    navigation: SalesTabNavigationProp
}

// ---

const Sales: React.FC<SalesProps> = ({ navigation }) => {
    return <>HOLA! SOY LA PANTALLA SALES</>
}

export default Sales;
