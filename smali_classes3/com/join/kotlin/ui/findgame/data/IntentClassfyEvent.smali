.class public final Lcom/join/kotlin/ui/findgame/data/IntentClassfyEvent;
.super Ljava/lang/Object;
.source "IntentClassfyEvent.kt"


# instance fields
.field private type:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/join/kotlin/ui/findgame/data/IntentClassfyEvent;->type:I

    return-void
.end method


# virtual methods
.method public final getType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/ui/findgame/data/IntentClassfyEvent;->type:I

    return v0
.end method

.method public final setType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/ui/findgame/data/IntentClassfyEvent;->type:I

    return-void
.end method
