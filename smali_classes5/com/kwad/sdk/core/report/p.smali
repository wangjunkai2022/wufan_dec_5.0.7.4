.class public final Lcom/kwad/sdk/core/report/p;
.super Lcom/kwad/sdk/core/report/c;
.source "SourceFile"


# static fields
.field public static Jr:I = 0x1

.field private static aAg:Ljava/lang/String; = "CREATE TABLE IF NOT EXISTS ksad_actions (actionId varchar(60) primary key, aLog TEXT)"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/report/p;->aAg:Ljava/lang/String;

    const-string v1, "ksadrep.db"

    invoke-direct {p0, p1, v1, p2, v0}, Lcom/kwad/sdk/core/report/c;-><init>(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method
