.class public final Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter$ModArchiveType;
.super Ljava/lang/Object;
.source "ModArchiveAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ModArchiveType"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter$ModArchiveType$Companion;
    }
.end annotation


# static fields
.field public static final ARCHIVELOCAL:I = 0x4

.field public static final ARCHIVESHOP:I = 0x3

.field public static final ARCHIVE_DETAIL:I = 0x5

.field public static final ARCHIVE_DOMAIN:I = 0x6

.field public static final Companion:Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter$ModArchiveType$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter$ModArchiveType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter$ModArchiveType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter$ModArchiveType;->Companion:Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter$ModArchiveType$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
