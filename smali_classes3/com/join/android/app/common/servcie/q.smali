.class public final synthetic Lcom/join/android/app/common/servcie/q;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final synthetic b:Lcom/join/android/app/common/servcie/q;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/join/android/app/common/servcie/q;

    invoke-direct {v0}, Lcom/join/android/app/common/servcie/q;-><init>()V

    sput-object v0, Lcom/join/android/app/common/servcie/q;->b:Lcom/join/android/app/common/servcie/q;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcom/join/android/app/common/servcie/DownloadService;->d(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
