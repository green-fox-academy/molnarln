namespace Auth_basics.Controllers
{
    internal class BinarySecretSecurityToken
    {
        private object _key;

        public BinarySecretSecurityToken(object key)
        {
            _key = key;
        }
    }
}