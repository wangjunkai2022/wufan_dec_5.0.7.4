.class public final Lcom/aggmoread/sdk/client/AMAdSize;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final AUTO_HEIGHT:I = -0x2

.field public static final FULL_WIDTH:I = -0x1


# instance fields
.field public adHeight:I

.field public adWidth:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/aggmoread/sdk/client/AMAdSize;->adWidth:I

    iput p2, p0, Lcom/aggmoread/sdk/client/AMAdSize;->adHeight:I

    return-void
.end method
