.class public final Lcom/beizi/ad/AdRequest;
.super Ljava/lang/Object;
.source "AdRequest.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/AdRequest$Builder;
    }
.end annotation


# static fields
.field public static final DEVICE_ID_EMULATOR:Ljava/lang/String;

.field public static final ERROR_CODE_AD_CACHE_FAILED:I = 0x6

.field public static final ERROR_CODE_INTERNAL_ERROR:I = 0x0

.field public static final ERROR_CODE_INVALID_REQUEST:I = 0x1

.field public static final ERROR_CODE_MEDIATION_AD_NOT_AVAILABLE:I = 0x3

.field public static final ERROR_CODE_NETWORK_ERROR:I = 0x2

.field public static final ERROR_CODE_NOT_READY_TO_REQUEST:I = 0x4

.field public static final ERROR_CODE_NO_FILL:I = 0x3

.field public static final ERROR_CODE_SUCCESS:I = -0x1

.field public static final GENDER_FEMALE:I = 0x2

.field public static final GENDER_MALE:I = 0x1

.field public static final GENDER_UNKNOWN:I = 0x0

.field public static final INVALID_DISPLAY:I = 0x5

.field public static final MAX_CONTENT_URL_LENGTH:I = 0x200


# instance fields
.field private final a:Lcom/beizi/ad/internal/network/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/network/a;->b:Ljava/lang/String;

    sput-object v0, Lcom/beizi/ad/AdRequest;->DEVICE_ID_EMULATOR:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Lcom/beizi/ad/AdRequest$Builder;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/beizi/ad/AdRequest$Builder;->access$000(Lcom/beizi/ad/AdRequest$Builder;)Lcom/beizi/ad/internal/network/a$a;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/AdRequest;->a:Lcom/beizi/ad/internal/network/a$a;

    return-void
.end method

.method synthetic constructor <init>(Lcom/beizi/ad/AdRequest$Builder;Lcom/beizi/ad/AdRequest$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/beizi/ad/AdRequest;-><init>(Lcom/beizi/ad/AdRequest$Builder;)V

    return-void
.end method


# virtual methods
.method public getBirthday()Ljava/util/Date;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/AdRequest;->a:Lcom/beizi/ad/internal/network/a$a;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/network/a$a;->a()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public getContentUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/AdRequest;->a:Lcom/beizi/ad/internal/network/a$a;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/network/a$a;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getGender()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/AdRequest;->a:Lcom/beizi/ad/internal/network/a$a;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/network/a$a;->c()I

    move-result v0

    return v0
.end method

.method public getKeywords()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/AdRequest;->a:Lcom/beizi/ad/internal/network/a$a;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/network/a$a;->d()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getNetworkExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/AdRequest;->a:Lcom/beizi/ad/internal/network/a$a;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/network/a$a;->a(Ljava/lang/Class;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public impl()Lcom/beizi/ad/internal/network/a$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/AdRequest;->a:Lcom/beizi/ad/internal/network/a$a;

    return-object v0
.end method
