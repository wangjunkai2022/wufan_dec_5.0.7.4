.class public interface abstract Lcom/bytedance/sdk/openadsdk/live/TTLiveConstants;
.super Ljava/lang/Object;


# static fields
.field public static final APP_SITEID_KEY:Ljava/lang/String; = "site_id"

.field public static final BUNDLE_KEY:Ljava/lang/String; = "bundle"

.field public static final CALL_FROM_LIVE:I = 0x0

.field public static final CALL_GET_LIVE_AUTH_STATUS:I = 0x4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final CALL_HANDLE_SCHEME:I = 0x8

.field public static final CALL_INIT:I = 0x5

.field public static final CALL_INNER_ENTER_FROM_MERGE:I = 0x1

.field public static final CALL_INNER_ENTER_METHOD:I = 0x2

.field public static final CALL_INNER_INVOKE:I = 0x3

.field public static final CALL_INNER_ON_EVENT:I = 0x4

.field public static final CALL_INNER_OPENLIVE:I = 0x0

.field public static final CALL_INVOKE_EXPAND_METHOD:I = 0x7

.field public static final CALL_LIVE_ROOM_STATUS:I = 0x2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final CALL_LIVE_SDK_INIT_STATUS:I = 0x1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final CALL_OPENLIVE:I = 0x0

.field public static final CALL_PLUGIN_LOAD_STATE:I = 0x3

.field public static final CALL_PLUGIN_LOGEVENT:I = 0x1

.field public static final CALL_PLUGIN_STATE_CHANGE:I = 0x2

.field public static final CALL_REGISTER_BRIDGE:I = 0x9

.field public static final CALL_SUBSCRIBE:I = 0x6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final CALL_WARM_UP_LIVE_ROOM:I = 0x3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final CONTEXT_KEY:Ljava/lang/String; = "context"

.field public static final DATA_LIVE_EFFECT_AD_LOG_EXTRA_MAP:Ljava/lang/String; = "live_effect_ad_log_extra_map"

.field public static final DOUYIN_AUTH_NAME:Ljava/lang/String; = "Venv Test"

.field public static final DOUYIN_TOKEN_KEY:Ljava/lang/String; = "douyin_token"

.field public static final EVENT:Ljava/lang/String; = "event"

.field public static final EXPAND_METHOD_NAME_KEY:Ljava/lang/String; = "expand_method_name"

.field public static final EXPAND_METHOD_PARAM_KEY:Ljava/lang/String; = "expand_method_param"

.field public static final EXTRA_ENTER_LIVE_EXTRA:Ljava/lang/String; = "live.intent.extra.ENTER_LIVE_EXTRA"

.field public static final EXTRA_REQUEST_ID:Ljava/lang/String; = "live.intent.extra.REQUEST_ID"

.field public static final IES_LIVE_EFFECT_AD_TRACK_EXTRA_SERVICE:Ljava/lang/String; = "IESLiveEffectAdTrackExtraServiceKey"

.field public static final INIT_APP_NAME:Ljava/lang/String; = "app_name"

.field public static final INIT_CHANNEL:Ljava/lang/String; = "channel"

.field public static final INIT_CUSTOM_CONTROLLER:Ljava/lang/String; = "c_control"

.field public static final INIT_DEBUG:Ljava/lang/String; = "debug"

.field public static final INIT_EC_HOST_APPID:Ljava/lang/String; = "ec_host_appid"

.field public static final INIT_GENERATE_APPID:Ljava/lang/String; = "g_appid"

.field public static final INIT_PARTENER:Ljava/lang/String; = "partner"

.field public static final INIT_PARTENER_SECERET:Ljava/lang/String; = "p_secret"

.field public static final INIT_SUB_PROCESS:Ljava/lang/String; = "sub_process"

.field public static final LIVE_API_VERSION_KEY:Ljava/lang/String; = "apiVersionCode"

.field public static final LIVE_INIT_CONFIG_KEY:Ljava/lang/String; = "liveInitConfig"

.field public static final LIVE_INIT_EXTRA_KEY:Ljava/lang/String; = "liveInitExtra"

.field public static final LIVE_META_KEY:Ljava/lang/String; = "ZEUS_PLUGIN_LIVE"

.field public static final LIVE_PLUGIN_INIT_STATUS:I = 0x3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final LIVE_POPUP_REWARD_AUTH_KEY:Ljava/lang/String; = "live_popup_reward_auth"

.field public static final LIVE_REWARD_AUTH_STATUS_KEY:Ljava/lang/String; = "csj.reward_auth_status"

.field public static final LIVE_REWARD_COUNT_KEY:Ljava/lang/String; = "csj.reward_countdown_duration_ms"

.field public static final LIVE_SDK_STATUS_FORBIDDOM:I = -0x1

.field public static final LIVE_SDK_STATUS_INIT_FAILED:I = -0x3

.field public static final LIVE_SDK_STATUS_INIT_SUCCESS:I = 0x2

.field public static final LIVE_SDK_STATUS_LOAD_FAILED:I = -0x2

.field public static final LIVE_SDK_STATUS_NON:I = 0x0

.field public static final LIVE_SDK_STATUS_NOT_INIT:I = 0x1

.field public static final LIVE_SDK_STATUS_PLUGIN_LOADED:I = 0x3

.field public static final LIVE_SDK_STATUS_START_INIT:I = 0x4

.field public static final LIVE_START_ACTIVITY_KEY:Ljava/lang/String; = "android.app.activity.request_code"

.field public static final LIVE_START_ACTIVITY_VALUE:I = 0x1

.field public static final LOG_EVENTNAME_KEY:Ljava/lang/String; = "log_eventName"

.field public static final LOG_PARAMSJSON_KEY:Ljava/lang/String; = "log_params"

.field public static final OPEN_LIVE_CODE_LIVESDKBRIDGE_IS_NULL:I = 0x4

.field public static final OPEN_LIVE_CODE_MATE_IS_NULL:I = 0x5

.field public static final OPEN_LIVE_CODE_NOTINITED:I = 0x1

.field public static final OPEN_LIVE_CODE_NOT_ACTIVITY:I = 0x7

.field public static final OPEN_LIVE_CODE_NOT_INNER_LIVE_MATE:I = 0x6

.field public static final OPEN_LIVE_CODE_OPENLIVE_FAILED:I = 0x2

.field public static final OPEN_LIVE_CODE_REWARD_COUNT_DOWN_ERROR:I = 0x8

.field public static final OPEN_LIVE_CODE_REWARD_DEFAULT:I = 0x9

.field public static final OPEN_LIVE_CODE_SUCCESS:I = 0x0

.field public static final OPEN_LIVE_CODE_VERSION_ERROR:I = 0x3

.field public static final PARAMS_LIVE_ROOM_STATUS:Ljava/lang/String; = "live_room_status"

.field public static final PARAMS_LIVE_SDK_INIT_STATUS:Ljava/lang/String; = "live_sdk_init_status"

.field public static final ROOMID_KEY:Ljava/lang/String; = "room_id"

.field public static final SCHEME_URI_KEY:Ljava/lang/String; = "scheme_uri"

.field public static final UPDATE_LIVE_SDK_INIT_STATUS:I = 0x2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field
