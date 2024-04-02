import { Button, Text } from "react-native";

const Profile = ({navigation}: any) => {
    return (<Button
        title="Go to Jane's profile"
        onPress={() =>
            navigation.navigate('Profile', {name: 'Jane'})
        }
      />)
 }
 
 export default Profile;